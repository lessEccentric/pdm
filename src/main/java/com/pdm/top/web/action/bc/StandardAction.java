package com.pdm.top.web.action.bc;

import java.sql.Timestamp;
import java.util.List;

import org.apache.struts2.ServletActionContext;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;
import com.pdm.top.domain.bc.Standard;
import com.pdm.top.domain.user.User;
import com.pdm.top.page.PageRequestBean;
import com.pdm.top.page.PageResponseBean;
import com.pdm.top.web.action.base.BaseAction;

/**
 * 收派标准管理
 * @author GUXIONG
 *
 */
@SuppressWarnings("serial")
public class StandardAction extends BaseAction implements ModelDriven<Standard>{

	//模型驱动
	private Standard standard = new Standard();
	
	@Override
	public Standard getModel() {
		// TODO Auto-generated method stub
		return standard;
	}
	
	//保存收派标准
	public String save() {
		User user = (User) ServletActionContext.getRequest().getSession().getAttribute("user");
		standard.setUser(user);
		standard.setUpdatetime(new Timestamp(System.currentTimeMillis()));
		
		standardService.saveStandard(standard);
		return "saveSUCCESS";
	}
	
	//分页查询收派标准数据
	public String pageQuery( ) {
		//查询未删除的标准
		DetachedCriteria detachedCriteria = DetachedCriteria.forClass(Standard.class);	//查询标准表所有数据
		PageRequestBean pageRequestBean = initPageRequestBean(detachedCriteria);
		//调用业务层
		PageResponseBean pageResponseBean = standardService.pageQuery(pageRequestBean);
		
		//将分页查询结果数据，转换为json格式
		ActionContext.getContext().put("pageResponseBean", pageResponseBean);
		
		return "pageQuerySUCCESS";
	}
	
	//批量删除
	public String delBatch() {
		String[] ids = standard.getId().split(", ");
		standardService.delBatch(ids);
		return "delBatchSUCCESS";
	}
	
	//查询取派标准json列表
	public String ajaxlist() {
		//查询出列表
		List<Standard> standards = standardService.ajaxlist();
		//将处理结果 准换为json返回
		ActionContext.getContext().put("standards", standards);
		
		return "ajaxlistSUCCESS";
	}
	
}
