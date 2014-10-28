package com.nord.net.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.nord.net.dao.DepartmentsDAO;
import com.nord.net.entity.Departments;
import com.nord.net.services.DepartmentService;

/**
 * 
 * @author hdoanthanh
 *
 */

@Service("departmentServiceImpl")
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	@Qualifier("departmentsDAOImpl")
	DepartmentsDAO departmentsDAOImpl;

	public Departments getDepartments(String id) {
		Departments department = new Departments();
		department.setDeptNo(id);
		department.setDeptName("Development Unit");
		return department;
	}

	public Departments saveDepartment(Departments department) {
		
		return department;
	}

	

}
