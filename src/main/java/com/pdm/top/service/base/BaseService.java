package com.pdm.top.service.base;

import com.pdm.top.dao.GenericDAO;
import com.pdm.top.domain.bc.Region;
import com.pdm.top.domain.bc.Staff;
import com.pdm.top.domain.bc.Standard;
import com.pdm.top.domain.bc.Subarea;
import com.pdm.top.domain.user.User;
import com.pdm.top.page.PageRequestBean;
import com.pdm.top.page.PageResponseBean;

import java.util.List;

import javax.annotation.Resource;

public abstract class BaseService {
    @Resource(name = "userDAO")
    protected GenericDAO<User> userDAO;
    
    @Resource(name = "standardDAO")
    protected GenericDAO<Standard> standardDAO;
    
    @Resource(name = "staffDAO")
    protected GenericDAO<Staff> staffDAO;
    
    @Resource(name = "regionDAO")
    protected GenericDAO<Region> regionDAO;
    
    @Resource(name = "subareaDAO")
    protected GenericDAO<Subarea> subareaDAO;
    
    @SuppressWarnings("unchecked")
	public <T> PageResponseBean pageQuery(PageRequestBean pageRequestBean, GenericDAO<T> dao) {
    	PageResponseBean pageResponseBean = new PageResponseBean();
    	
    	
    	// 查询当前页显示数据
    	int firstResult = (pageRequestBean.getPage() - 1) * pageRequestBean.getRows(); // 　从哪条开始
    	int maxResults = pageRequestBean.getRows(); // 返回记录数
    	List<T> data = (List<T>) dao.pageQuery(pageRequestBean.getDetachedCriteria(), firstResult, maxResults);
    	pageResponseBean.setRows(data);
    	
    	// 满足当前条件，记录总条数
    	long totalCount = dao.findTotalCount(pageRequestBean.getDetachedCriteria());
    	pageResponseBean.setTotal(totalCount);
    	
    	return pageResponseBean;
    }
}
