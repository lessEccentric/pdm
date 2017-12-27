package com.pdm.top.service.bc;



import com.pdm.top.domain.bc.Subarea;
import com.pdm.top.page.PageQuery;

public interface SubareaService extends PageQuery{
	
	
	/**批量删除
	 * @param ids
	 */
	public void delBatch(String[] ids);

	public void saveOrUpdate(Subarea subarea);


}
