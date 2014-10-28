package com.nord.net.dao.impl;

import java.util.Map;

import javax.persistence.Cache;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnitUtil;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.metamodel.Metamodel;

public class BaseDAO implements EntityManagerFactory {

	public void close() {
		// TODO Auto-generated method stub
		
	}

	public EntityManager createEntityManager() {
		// TODO Auto-generated method stub
		return null;
	}

	public EntityManager createEntityManager(Map arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public Cache getCache() {
		// TODO Auto-generated method stub
		return null;
	}

	public CriteriaBuilder getCriteriaBuilder() {
		// TODO Auto-generated method stub
		return null;
	}

	public Metamodel getMetamodel() {
		// TODO Auto-generated method stub
		return null;
	}

	public PersistenceUnitUtil getPersistenceUnitUtil() {
		// TODO Auto-generated method stub
		return null;
	}

	public Map<String, Object> getProperties() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isOpen() {
		// TODO Auto-generated method stub
		return false;
	}

}
