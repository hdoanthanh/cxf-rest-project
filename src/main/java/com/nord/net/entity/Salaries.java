package com.nord.net.entity;

// Generated Oct 24, 2014 3:04:42 PM by Hibernate Tools 4.3.1

import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Salaries generated by hbm2java
 */
@Entity
@Table(name = "salaries", catalog = "employees")
public class Salaries implements java.io.Serializable {

	private SalariesId id;
	private Employees employees;
	private int salary;
	private Date toDate;

	public Salaries() {
	}

	public Salaries(SalariesId id, Employees employees, int salary, Date toDate) {
		this.id = id;
		this.employees = employees;
		this.salary = salary;
		this.toDate = toDate;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "empNo", column = @Column(name = "emp_no", nullable = false)),
			@AttributeOverride(name = "fromDate", column = @Column(name = "from_date", nullable = false, length = 10)) })
	public SalariesId getId() {
		return this.id;
	}

	public void setId(SalariesId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "emp_no", nullable = false, insertable = false, updatable = false)
	public Employees getEmployees() {
		return this.employees;
	}

	public void setEmployees(Employees employees) {
		this.employees = employees;
	}

	@Column(name = "salary", nullable = false)
	public int getSalary() {
		return this.salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "to_date", nullable = false, length = 10)
	public Date getToDate() {
		return this.toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

}
