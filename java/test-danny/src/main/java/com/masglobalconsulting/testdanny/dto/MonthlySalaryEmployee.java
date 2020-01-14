package com.masglobalconsulting.testdanny.dto;

public class MonthlySalaryEmployee extends Employee {

	public MonthlySalaryEmployee(int id, String name, String contractTypeName, int roleId, String roleName,
			String roleDescription, long hourlySalary, long monthlySalary) {
		super(id, name, contractTypeName, roleId, roleName, roleDescription, hourlySalary, monthlySalary);
		this.calculateAnnualSalary(monthlySalary);
		this.setContractName();
	}

	@Override
	public void calculateAnnualSalary(long Salary) {
		long annualSalary = Salary * monthsYear;
		this.setAnnualSalary(annualSalary);
	}

	@Override
	public void setContractName() {
		this.setContractTypeName("Monthly Salary Contract");
	}

}
