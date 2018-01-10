package com.pdm.top.web.action.base;

import com.opensymphony.xwork2.ActionSupport;
import com.pdm.top.page.PageRequestBean;
import com.pdm.top.service.bc.DecidedZoneService;
import com.pdm.top.service.bc.RegionService;
import com.pdm.top.service.bc.StaffService;
import com.pdm.top.service.bc.StandardService;
import com.pdm.top.service.bc.SubareaService;
import com.pdm.top.service.user.UserService;

import javax.annotation.Resource;

import org.hibernate.criterion.DetachedCriteria;

public abstract class BaseAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7874385464839933491L;

	@Resource(name = "userService")
	protected UserService userService;

	@Resource(name = "standardService")
	protected StandardService standardService;

	@Resource(name = "staffService")
	protected StaffService staffService;
	
	@Resource(name = "regionService")
	protected RegionService regionService;
	
	@Resource(name = "subareaService")
	protected SubareaService subareaService;
	
	@Resource(name = "decidedZoneService")
	protected DecidedZoneService decidedZoneService;
	
	

	// 封装分页参数
	protected int page;
	protected int rows;

	public void setPage(int page) {
		this.page = page;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public PageRequestBean initPageRequestBean(DetachedCriteria detachedCriteria) {
		// 将分页查询参数封装
		PageRequestBean pageRequestBean = new PageRequestBean();
		pageRequestBean.setPage(page);
		pageRequestBean.setRows(rows);

		pageRequestBean.setDetachedCriteria(detachedCriteria);
		return pageRequestBean;
	}

}
