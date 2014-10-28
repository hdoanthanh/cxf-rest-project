package com.nord.net.dao;

import com.nord.net.common.dao.GenericDAO;
import com.nord.net.entity.Departments;

/**
 * 
 * @author hdoanthanh
 *
 */
public interface DepartmentsDAO extends GenericDAO<Departments>{

	public Departments getDepartments(String id);
	
	public Departments saveDepartments(Departments departmnet);
}
