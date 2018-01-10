package com.pdm.top.service.impl.bc;


import java.util.List;

import com.pdm.top.domain.bc.Staff;
import com.pdm.top.page.PageRequestBean;
import com.pdm.top.page.PageResponseBean;
import com.pdm.top.service.base.BaseService;
import com.pdm.top.service.bc.StaffService;

public class StaffServiceImpl extends BaseService implements StaffService {

	@Override
	public PageResponseBean pageQuery(PageRequestBean pageRequestBean) {
		return pageQuery(pageRequestBean, staffDAO);
	}

	@Override
	public void delBatch(String[] ids) {
		for (String id : ids) {
			Staff staff = staffDAO.findById(id);
			staff.setDeltag("1");
		}
	}

	@Override
	public void saveOrUpdate(Staff staff) {
		staffDAO.saveOrupdate(staff);
	}

	@Override
	public void restore(String[] ids) {
		for (String id : ids) {
			Staff staff = staffDAO.findById(id);
			staff.setDeltag("0");
		}
	}

	@Override
	public List<Staff> findAllNoDeleteStaffs() {
		return staffDAO.findByNamedQuery("Staff.findNoDelete");
	}

}
