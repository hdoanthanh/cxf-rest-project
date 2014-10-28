package com.nord.net.services;

import com.nord.net.entity.Departments;
/**
 * 
 * @author hdoanthanh
 *
 */

public interface DepartmentService {

	public Departments getDepartments(String id);

	public Departments saveDepartment(Departments department);
}
