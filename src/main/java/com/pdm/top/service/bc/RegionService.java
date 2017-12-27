package com.pdm.top.service.bc;


import java.util.List;

import com.pdm.top.domain.bc.Region;
import com.pdm.top.page.PageQuery;

public interface RegionService extends PageQuery{
	
	
	/**批量删除
	 * @param ids
	 */
	public void delBatch(String[] ids);

	public void saveOrUpdate(Region region);

	public List<Region> findAllRegions();


}
