package com.masglobalconsulting.testdanny.dto;

public class EmployeeMapper {
	private int id;
	private String name;
	private String contractTypeName;
	private int roleId;
	private String roleName;
	private String roleDescription;
	private long hourlySalary;
	private long monthlySalary;
	
	public EmployeeMapper() {
		
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
	public EmployeeMapper(int id, String name, String contractTypeName, int roleId, String roleName,
			String roleDescription, long hourlySalary, long monthlySalary) {
		super();
		this.id = id;
		this.name = name;
		this.contractTypeName = contractTypeName;
		this.roleId = roleId;
		this.roleName = roleName;
		this.roleDescription = roleDescription;
		this.hourlySalary = hourlySalary;
		this.monthlySalary = monthlySalary;
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

	public long getHourlySalary() {
		return hourlySalary;
	}

	public void setHourlySalary(long hourlySalary) {
		this.hourlySalary = hourlySalary;
	}

	public long getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(long monthlySalary) {
		this.monthlySalary = monthlySalary;
	}
	
}
