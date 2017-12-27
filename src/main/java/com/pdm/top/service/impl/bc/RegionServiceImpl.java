package com.pdm.top.service.impl.bc;

import java.util.List;

import com.pdm.top.domain.bc.Region;
import com.pdm.top.page.PageRequestBean;
import com.pdm.top.page.PageResponseBean;
import com.pdm.top.service.base.BaseService;
import com.pdm.top.service.bc.RegionService;

public class RegionServiceImpl extends BaseService implements RegionService {

	@Override
	public PageResponseBean pageQuery(PageRequestBean pageRequestBean) {
		return pageQuery(pageRequestBean, regionDAO);
	}

	@Override
	public void delBatch(String[] ids) {
		// TODO Auto-generated method stub

	}

	@Override
	public void saveOrUpdate(Region region) {
		regionDAO.saveOrupdate(region);
	}

	@Override
	public List<Region> findAllRegions() {
		return regionDAO.findAll();
	}

}
