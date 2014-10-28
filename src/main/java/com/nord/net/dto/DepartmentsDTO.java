package com.nord.net.dto;

/**
 * 
 * @author hdoanthanh
 *
 */
public class DepartmentsDTO extends BaseDTO {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String deptNo;
	private String deptName;
	
	
	public String getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(String deptNo) {
		this.deptNo = deptNo;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	

}
