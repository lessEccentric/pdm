package com.pdm.top.dao.impl;

import com.pdm.top.dao.GenericDAO;
import com.pdm.top.domain.bc.Staff;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Projections;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.io.Serializable;
import java.util.List;

public class GenericDAOImpl<T> extends HibernateDaoSupport implements GenericDAO<T> {

    private String className;

    public GenericDAOImpl(String className) {
        this.className = className;
    }

    public void save(T obj) {
        this.getHibernateTemplate().save(obj);
    }

    public void update(T obj) {
        this.getHibernateTemplate().update(obj);
    }

    public void delete(T obj) {
        this.getHibernateTemplate().delete(obj);
    }

    @SuppressWarnings("unchecked")
	public T findById(Serializable id) {
        Class<?> clazz = null;
        try {
            clazz = Class.forName(className);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T) this.getHibernateTemplate().get(clazz, id);
    }

    @SuppressWarnings("unchecked")
	public List<T> findAll() {
        return this.getHibernateTemplate().find("from " + className);
    }

    @SuppressWarnings("unchecked")
	public List<T> findByNamedQuery(String queryName, Object... values) {
        return this.getHibernateTemplate().findByNamedQuery(queryName, values);
    }

    @SuppressWarnings("unchecked")
	public List<T> findByCriteria(DetachedCriteria detachedCriteria) {
        return this.getHibernateTemplate().findByCriteria(detachedCriteria);
    }

	@Override
	public long findTotalCount(DetachedCriteria detachedCriteria) {
		detachedCriteria.setProjection(Projections.rowCount());	//投影查询
		List<Long> list = this.getHibernateTemplate().findByCriteria(detachedCriteria, 0, 1);
		return list.get(0);
	}

	@Override
	public void saveOrupdate(T obj) {
		this.getHibernateTemplate().saveOrUpdate(obj);
	}

	@Override
	public List<Staff> pageQuery(DetachedCriteria detachedCriteria, int firstResult, int maxResults) {
		return this.getHibernateTemplate().findByCriteria(detachedCriteria, firstResult, maxResults);
	}
}
