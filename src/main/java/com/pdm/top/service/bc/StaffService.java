package com.pdm.top.service.bc;


import java.util.List;

import com.pdm.top.domain.bc.Staff;
import com.pdm.top.page.PageQuery;

public interface StaffService extends PageQuery{
	
	
	/**批量删除
	 * @param ids
	 */
	public void delBatch(String[] ids);

	public void saveOrUpdate(Staff staff);

	public void restore(String[] ids);

	public List<Staff> findAllNoDeleteStaffs();

}
