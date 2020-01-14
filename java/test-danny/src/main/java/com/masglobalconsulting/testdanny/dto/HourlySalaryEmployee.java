package com.masglobalconsulting.testdanny.dto;

public class HourlySalaryEmployee extends Employee {

	public HourlySalaryEmployee(int id, String name, String contractTypeName, int roleId, String roleName,
			String roleDescription, long hourlySalary, long monthlySalary) {
		super(id, name, contractTypeName, roleId, roleName, roleDescription, hourlySalary, monthlySalary);
		this.calculateAnnualSalary(hourlySalary);
		this.setContractName();
	}

	@Override
	public void calculateAnnualSalary(long Salary) {
		long annualSalary = hoursMonth * Salary * monthsYear;
		this.setAnnualSalary(annualSalary);
	}

	@Override
	public void setContractName() {
		this.setContractTypeName("Hourly Salary Contract");
	}


}
