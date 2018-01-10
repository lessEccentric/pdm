package com.pdm.top.web.action.bc;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.struts2.ServletActionContext;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;
import com.pdm.top.domain.bc.Subarea;
import com.pdm.top.page.PageRequestBean;
import com.pdm.top.page.PageResponseBean;
import com.pdm.top.utils.FileUtils;
import com.pdm.top.web.action.base.BaseAction;

/**
 * 分区管理
 * @author GUXIONG
 *
 */
@SuppressWarnings("serial")
public class SubareaAction extends BaseAction implements ModelDriven<Subarea>{

	private Subarea subarea = new Subarea();
	
	@Override
	public Subarea getModel() {
		// TODO Auto-generated method stub
		return this.subarea;
	}
	
	//分页查询
	public String pageQuery() {
		DetachedCriteria detachedCriteria = DetachedCriteria.forClass(Subarea.class);
		
		//针对QBC添加查询条件
		if(subarea.getAddresskey() != null && subarea.getAddresskey().trim().length()>0) {
			//添加关键字条件
			detachedCriteria.add(Restrictions.like("addressKey", "%" + subarea.getAddresskey() + "%"));
		}
		if(subarea.getDecidedZone() != null && subarea.getDecidedZone().getId() != null && subarea.getDecidedZone().getId().trim().length()>0) {
			//输入定区
			detachedCriteria.add(Restrictions.eq("decideZone", subarea.getDecidedZone()));
		}
		if(subarea.getRegion() != null) {
			detachedCriteria.createAlias("region", "r");
			if(subarea.getRegion().getProvince() != null && subarea.getRegion().getProvince().trim().length()>0) {
				detachedCriteria.add(Restrictions.like("r.province", "%" + subarea.getRegion().getProvince() + "%"));
			}
			if(subarea.getRegion().getCity() != null && subarea.getRegion().getCity().trim().length()>0) {
				detachedCriteria.add(Restrictions.like("r.city", "%" + subarea.getRegion().getCity() + "%"));
			}
			if(subarea.getRegion().getDistrict() != null && subarea.getRegion().getDistrict().trim().length()>0) {
				detachedCriteria.add(Restrictions.like("r.district", "%" + subarea.getRegion().getDistrict() + "%"));
			}
			
		}
		PageRequestBean pageRequestBean = initPageRequestBean(detachedCriteria);
		
		//调用业务层 查询PageResponseBean对象
		PageResponseBean pageResponseBean = subareaService.pageQuery(pageRequestBean);
		
		ActionContext.getContext().put("pageResponseBean", pageResponseBean);
		
		//将查询结果缓存到session中
		ServletActionContext.getRequest().getSession().setAttribute("pageResponseBean", pageResponseBean);
		
		return "pageQuerySUCCESS";
	}
	
	//保存分区
	public String saveOrUpdate() {
		subareaService.saveOrUpdate(subarea);
		return "saveOrUpdateSUCCESS";
	}
	
	//导出Excel
	public String exportXls() throws IOException {
		String downLoadFileName = "分区信息.xls";
		String agent = ServletActionContext.getRequest().getHeader("user-agent");
		
		//对下载文件名编码
		downLoadFileName = FileUtils.encodDownLoadFileName(downLoadFileName, agent);
		//将结果放入值栈
		ActionContext.getContext().put("downLoadFileName", downLoadFileName);
		
		return "exportXlsSUCCESS";
	}
	
	@SuppressWarnings("unchecked")
	public InputStream getInputStream() throws IOException {
		//将session中的PageResponseBean中数据，生成Excel
		PageResponseBean pageResponseBean = (PageResponseBean) ServletActionContext.getRequest().getSession().getAttribute("pageResponseBean");
		List<Subarea> subareas = pageResponseBean.getRows();
		
		//根据内存的数据生成Excel
		//工作薄
		HSSFWorkbook hssfWorkbook = new HSSFWorkbook();
		//sheet
		HSSFSheet sheet = hssfWorkbook.createSheet("分区数据");
		//先写标题行
		HSSFRow headRow = sheet.createRow(0);	//第一行
		headRow.createCell(0).setCellValue("分区编号");
		headRow.createCell(1).setCellValue("关键字");
		headRow.createCell(2).setCellValue("起始号");
		headRow.createCell(3).setCellValue("结束号");
		headRow.createCell(4).setCellValue("是否区分单双号");
		headRow.createCell(5).setCellValue("位置信息");
		
		//向Excel中写数据
		for (Subarea subarea : subareas) {
			HSSFRow dataRow = sheet.createRow(sheet.getLastRowNum() + 1);
			dataRow.createCell(0).setCellValue(subarea.getId());
			dataRow.createCell(1).setCellValue(subarea.getAddresskey());
			dataRow.createCell(2).setCellValue(subarea.getStartnum());
			dataRow.createCell(3).setCellValue(subarea.getEndnum());
			dataRow.createCell(4).setCellValue(subarea.getSingle());
			dataRow.createCell(5).setCellValue(subarea.getPosition());
		}
		
		//将数据缓存到字节数组
		ByteArrayOutputStream arrayOutputStream = new ByteArrayOutputStream();
		hssfWorkbook.write(arrayOutputStream);
		arrayOutputStream.close();
		byte[] data = arrayOutputStream.toByteArray();
		
		//再通过字节数组输入流读取数据
		return new ByteArrayInputStream(data);
	}
	
	public String findnoassociations() {
		List<Subarea> subareas = subareaService.findnoassociations();
		ActionContext.getContext().put("subareas", subareas);
		return "findnoassociationsSUCCESS";
	}
	
	//删除
	public String delBatch() {
		String[] ids = subarea.getId().split(", ");
		subareaService.delBatch(ids);
		return "delBatchSUCCESS";
	}
	
	
}
