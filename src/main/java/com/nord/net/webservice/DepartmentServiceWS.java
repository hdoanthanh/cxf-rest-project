package com.nord.net.webservice;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.ext.Provider;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;

import com.nord.net.dto.DepartmentsDTO;
import com.nord.net.entity.Departments;
import com.nord.net.services.DepartmentService;


/**
 * 
 * @author hdoanthanh
 *
 */
@Scope("request")
@Path("/departmentServiceManagement")
public class DepartmentServiceWS {
	final Log logger = LogFactory.getLog(DepartmentServiceWS.class);

	@Autowired
	@Qualifier("departmentServiceImpl")
	DepartmentService departmentServiceImpl;

	@GET
	@Path("/{departmentId}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public DepartmentsDTO getProductService(@PathParam("departmentId") final String id) {
		Departments departments = departmentServiceImpl.getDepartments(id);
		DepartmentsDTO departmentsDTO = new DepartmentsDTO();
		BeanUtils.copyProperties(departments, departmentsDTO);
	return departmentsDTO;
	}
}
