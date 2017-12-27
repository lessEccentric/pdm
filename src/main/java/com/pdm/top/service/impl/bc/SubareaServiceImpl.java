package com.pdm.top.service.impl.bc;


import com.pdm.top.domain.bc.Subarea;
import com.pdm.top.page.PageRequestBean;
import com.pdm.top.page.PageResponseBean;
import com.pdm.top.service.base.BaseService;
import com.pdm.top.service.bc.SubareaService;

public class SubareaServiceImpl extends BaseService implements SubareaService {

	@Override
	public PageResponseBean pageQuery(PageRequestBean pageRequestBean) {
		return pageQuery(pageRequestBean, subareaDAO);
	}

	@Override
	public void delBatch(String[] ids) {
		for (String id : ids) {
			Subarea subarea = subareaDAO.findById(id);
			subareaDAO.delete(subarea);
		}
	}

	@Override
	public void saveOrUpdate(Subarea subarea) {
		subareaDAO.saveOrupdate(subarea);
	}

}
