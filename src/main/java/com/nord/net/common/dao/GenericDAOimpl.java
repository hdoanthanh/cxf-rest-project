package com.nord.net.common.dao;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Map;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.nord.net.common.AbstractCriteriaDAO;

public abstract class GenericDAOimpl<T> implements GenericDAO<T> {

	@Resource
	@Autowired
	SessionFactory sessionFactory;
	
	private Class<T> type;
	
	@SuppressWarnings("unchecked")
	public GenericDAOimpl() {
		Type t = getClass().getGenericSuperclass();
		ParameterizedType paramType = (ParameterizedType) t;
		clazz = (Class) paramType.getActualTypeArguments()[0];
	}
	
    @SuppressWarnings("unchecked")
   	protected Class<T> getEntityClass() {
   		return (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
   	}
	
	public GenericDAOimpl(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}
	
	public Session getSession(){
		Session session = getSessionFactory().getCurrentSession();
		if(session==null){
			session = getSessionFactory().openSession();
		}
		return session;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Collection<T> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public Collection<T> getDistinctAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public T saveOrUpdate(T object) {
		// TODO Auto-generated method stub
		return null;
	}

	public void remove(T object) {
		// TODO Auto-generated method stub
		
	}

	public T find(T object) {
		// TODO Auto-generated method stub
		return null;
	}

	public T update(T object) {
		// TODO Auto-generated method stub
		return null;
	}

	public Collection<T> findByCriteria(AbstractCriteriaDAO criteria) {
		// TODO Auto-generated method stub
		return null;
	}

	private Class<T> clazz;
	
}
