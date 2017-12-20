package com.pdm.top.service.bc;

import java.util.List;

import com.pdm.top.domain.bc.Standard;
import com.pdm.top.page.PageQuery;

public interface StandardService extends PageQuery {
	/**
	 * 保存标准
	 * @param standard
	 */
	public void saveStandard(Standard standard);

	
	/**批量删除
	 * @param ids
	 */
	public void delBatch(String[] ids);

	/**
	 * 获取标准列表
	 * @return
	 */
	public List<Standard> ajaxlist();

}
