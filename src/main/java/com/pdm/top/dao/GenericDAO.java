package com.pdm.top.dao;

import org.hibernate.criterion.DetachedCriteria;

import java.io.Serializable;
import java.util.List;

/**
 * 通用DAO 设计接口
 *
 */
public interface GenericDAO<T> {

    /**
     * 保存
     * @param obj
     */
    public void save(T obj);

    /**
     * 更新
     * @param obj
     */
    public void update(T obj);

    /**
     * 删除
     * @param obj
     */
    public void delete(T obj);

    /**
     * 根据Id查询
     * @param id
     * @return
     */
    public T findById(Serializable id);

    /**
     * 查询所有
     * @return
     */
    public List<T> findAll();

    /**
     *
     * 条件查询
     */
    public List<T> findByNamedQuery(String queryName, Object... values); //根据hql查询

    public List<T> findByCriteria(DetachedCriteria detachedCriteria);  //面向对象条件查询


}
