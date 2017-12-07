package com.pdm.top.web.interceptor;


import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.pdm.top.domain.user.User;

/**
 * 自定义拦截器
 * @author GUXIONG
 *
 */
public class LoginInterceptor extends AbstractInterceptor{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		
		User user = (User) ServletActionContext.getRequest().getSession().getAttribute("user");
		if(user == null) {
			//未登录 设置错误信息
			ActionSupport action = (ActionSupport) invocation.getAction();
			action.addActionError("你还未登录或长时间未使用，请重新登陆！");
			return "login"; //登录页面
		} else {
			//已经登陆
			return invocation.invoke();
		}
	}

}
