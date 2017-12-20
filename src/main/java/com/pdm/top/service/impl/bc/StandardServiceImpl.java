package com.pdm.top.service.impl.bc;

import java.util.List;

import com.pdm.top.domain.bc.Standard;
import com.pdm.top.page.PageRequestBean;
import com.pdm.top.page.PageResponseBean;
import com.pdm.top.service.base.BaseService;
import com.pdm.top.service.bc.StandardService;

public class StandardServiceImpl extends BaseService implements StandardService {

	@Override
	public void saveStandard(Standard standard) {
		standardDAO.saveOrupdate(standard);
	}

	//分页查询
	@Override
	public PageResponseBean pageQuery(PageRequestBean pageRequestBean) {
		return pageQuery(pageRequestBean, staffDAO);
	}

	@Override
	public void delBatch(String[] ids) {
		for (String id : ids) {
			Standard standard = standardDAO.findById(id);
			standard.setDeltag("1");
		}
	}

	@Override
	public List<Standard> ajaxlist() {
		return standardDAO.findByNamedQuery("Standard.ajaxlist");
	}

}
