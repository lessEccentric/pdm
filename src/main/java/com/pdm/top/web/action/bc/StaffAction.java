package com.pdm.top.web.action.bc;



import org.hibernate.criterion.DetachedCriteria;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;
import com.pdm.top.domain.bc.Staff;
import com.pdm.top.page.PageRequestBean;
import com.pdm.top.page.PageResponseBean;
import com.pdm.top.web.action.base.BaseAction;

@SuppressWarnings("serial")
public class StaffAction extends BaseAction implements ModelDriven<Staff> {

	private Staff staff = new Staff();

	@Override
	public Staff getModel() {
		return staff;
	}

	// 保存或修改取派员
	public String saveOrUpdate() {
		//staff对象中 关联游离状态standard对象
		staffService.saveOrUpdate(staff);
		return "saveOrUpdateSUCCESS";
	}
	
	//分页查询
	public String pageQuery() {
		DetachedCriteria detachedCriteria = DetachedCriteria.forClass(Staff.class);
		PageRequestBean pageRequestBean = initPageRequestBean(detachedCriteria);
		//调用业务层
		PageResponseBean pageResponseBean = staffService.pageQuery(pageRequestBean);
		//将结果转换为json
		ActionContext.getContext().put("pageResponseBean", pageResponseBean);
		return "pageQuerySUCCESS";
	}
	
	//批量删除
	public String delBatch() {
		String[] ids = staff.getId().split(", ");
		staffService.delBatch(ids);
		return "delBatchSUCCESS";
	}
	
}
