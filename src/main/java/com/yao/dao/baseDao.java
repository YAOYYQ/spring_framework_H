package com.yao.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by YAO on 15/12/23.
 */
public class baseDao<T> {
    @PersistenceContext
    protected EntityManager entityManager;
    private Class<?> prototype;
    public baseDao(Class<?> prototype)
    {
        this.prototype = prototype;
    }
    public void save(T s){
        entityManager.persist(s);
    }
}
