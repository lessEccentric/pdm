package com.pdm.top.web.action.base;

import com.opensymphony.xwork2.ActionSupport;
import com.pdm.top.service.bc.StandardService;
import com.pdm.top.service.user.UserService;

import javax.annotation.Resource;

public abstract class BaseAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7874385464839933491L;
	
	@Resource(name = "userService")
    protected UserService userService;
	
	@Resource(name = "standardService")
	protected StandardService standardService;
}
