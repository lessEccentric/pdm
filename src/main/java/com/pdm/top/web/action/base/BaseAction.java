package com.pdm.top.web.action.base;

import com.opensymphony.xwork2.ActionSupport;
import com.pdm.top.service.user.UserService;

import javax.annotation.Resource;

public abstract class BaseAction extends ActionSupport {
    @Resource(name = "userService")
    protected UserService userService;
}
