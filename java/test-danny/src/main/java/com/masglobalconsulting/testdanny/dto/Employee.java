package com.masglobalconsulting.testdanny.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

public abstract class Employee {
	private int id;
	private String name;
	private String contractTypeName;
	private int roleId;
	private String roleName;
	private String roleDescription;
	private long hourlySalary;
	private long monthlySalary;
	private long annualSalary;
	final int monthsYear = 12;
	final int hoursMonth = 120;
	
	public Employee() {
		super();
	}

	/**
	 * @param id
	 * @param name
	 * @param contractTypeName
	 * @param roleId
	 * @param roleName
	 * @param roleDescription
	 * @param hourlySalary
	 * @param monthlySalary
	 */
	public Employee(int id, String name, String contractTypeName, int roleId, String roleName, String roleDescription,
			long hourlySalary, long monthlySalary) {
		super();
		setId(id);
		setName(name);
		setRoleId(roleId);
		setRoleName(roleName);
		setRoleDescription(roleDescription);
		setHourlySalary(hourlySalary);
		setMonthlySalary(monthlySalary);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContractTypeName() {
		return contractTypeName;
	}
	
	public void setContractTypeName(String contractTypeName) {
		this.contractTypeName = contractTypeName;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleDescription() {
		return roleDescription;
	}

	public void setRoleDescription(String roleDescription) {
		this.roleDescription = roleDescription;
	}
	
	@JsonIgnore
	public long getHourlySalary() {
		return hourlySalary;
	}
	
	public void setHourlySalary(long hourlySalary) {
		this.hourlySalary = hourlySalary;
	}
	
	@JsonIgnore
	public long getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(long monthlySalary) {
		this.monthlySalary = monthlySalary;
	}

	public long getAnnualSalary() {
		return annualSalary;
	}

	public void setAnnualSalary(long annualSalary) {
		this.annualSalary = annualSalary;
	}
	
	public abstract void calculateAnnualSalary(long Salary);
	
	public abstract void setContractName();

}
