package com.pdm.top.service.base;

import com.pdm.top.dao.GenericDAO;
import com.pdm.top.domain.bc.Standard;
import com.pdm.top.domain.user.User;

import javax.annotation.Resource;

public abstract class BaseService {
    @Resource(name = "userDAO")
    protected GenericDAO<User> userDAO;
    
    @Resource(name = "standardDAO")
    protected GenericDAO<Standard> standardDAO;
}
