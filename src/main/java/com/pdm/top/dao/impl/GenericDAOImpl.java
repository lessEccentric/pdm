package com.pdm.top.dao.impl;

import com.pdm.top.dao.GenericDAO;
import org.hibernate.criterion.DetachedCriteria;
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

    public T findById(Serializable id) {
        Class<?> clazz = null;
        try {
            clazz = Class.forName(className);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T) this.getHibernateTemplate().get(clazz, id);
    }

    public List<T> findAll() {
        return this.getHibernateTemplate().find("from " + className);
    }

    public List<T> findByNamedQuery(String queryName, Object... values) {
        return this.getHibernateTemplate().findByNamedQuery(queryName, values);
    }

    public List<T> findByCriteria(DetachedCriteria detachedCriteria) {
        return this.getHibernateTemplate().findByCriteria(detachedCriteria);
    }
}
