package com.pdm.top.web.action.bc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.hibernate.criterion.DetachedCriteria;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ModelDriven;
import com.pdm.top.domain.bc.Region;
import com.pdm.top.page.PageRequestBean;
import com.pdm.top.page.PageResponseBean;
import com.pdm.top.utils.PinYin4jUtils;
import com.pdm.top.web.action.base.BaseAction;

/**
 * 区域管理
 * @author GUXIONG
 *
 */
@SuppressWarnings("serial")
public class RegionAction extends BaseAction implements ModelDriven<Region>{

	//使用log4j日志记录 记录日志
	private static final Logger LOG = Logger.getLogger(RegionAction.class);
	
	private Region region = new Region();
	
	@Override
	public Region getModel() {
		// TODO Auto-generated method stub
		return this.region;
	}
	
	//分页查询
	public String pageQuery() {
		DetachedCriteria detachedCriteria = DetachedCriteria.forClass(Region.class);
		PageRequestBean pageRequestBean = initPageRequestBean(detachedCriteria);
		
		PageResponseBean pageResponseBean = regionService.pageQuery(pageRequestBean);
		
		ActionContext.getContext().put("pageResponseBean", pageResponseBean);
		
		return "pageQuerySUCCESS";
	}
	
	//批量导入区域信息
	public String importXls() throws IOException {
		//工作薄对象
		HSSFWorkbook hssfWorkbook = new HSSFWorkbook(new FileInputStream(upload));
		//解析工作薄避免空指针异常
		hssfWorkbook.setMissingCellPolicy(Row.CREATE_NULL_AS_BLANK);
		//获得sheet
		HSSFSheet sheet = hssfWorkbook.getSheetAt(0);
		//遍历每一行
		for (Row row : sheet) {
			//进行解析  每一行数据对应一个Region区域
			if(row.getRowNum() == 0) {//第一行无需解析
				continue;
			}
			Region region = new Region();
			String id = row.getCell(0).getStringCellValue();
			if(id.trim().equals("")) {
				continue;
			}
			region.setId(id);
			region.setProvince(row.getCell(1).getStringCellValue());
			region.setCity(row.getCell(2).getStringCellValue());
			region.setDistrict(row.getCell(3).getStringCellValue());
			region.setPostcode(row.getCell(4).getStringCellValue());
			//使用pinyin4j生成简码
			//连接省市区
			String str = region.getProvince() + region.getCity() + region.getDistrict();
			str.replaceAll("省", "").replaceAll("市", "").replaceAll("区", "");
			//使用pinyin4j
			String[] arr = PinYin4jUtils.getHeadByString(str);
			StringBuffer sb = new StringBuffer();
			for (String headchar : arr) {
				sb.append(headchar);
			}
			region.setShortcode(sb.toString());	//简码
			region.setCitycode(PinYin4jUtils.hanziToPinyin(region.getCity().replaceAll("市", ""),""));
			
			//保存信息
			try {
				regionService.saveOrUpdate(region);
			} catch (Exception e) {
				//导入region失败
				LOG.error("区域导入失败，编号：" + region.getId(), e);
			}
		}
		
		//返回json
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("reslut", "success");
		map.put("msg", "区域导入完成");
		
		ActionContext.getContext().put("map", map);
		
		return "importXlsSUCCESS";
	}
	
	//查询所有区域，转换json列表
	public String ajaxlist() {
		List<Region> regions = regionService.findAllRegions();
		ActionContext.getContext().put("regions", regions);
		return "ajaxlistSUCCESS";
	}
	
	//接收上传文件
	private File upload;

	public void setUpload(File upload) {
		this.upload = upload;
	}
	

}
