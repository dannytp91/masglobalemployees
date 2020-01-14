package com.masglobalconsulting.testdanny.dto;

import com.masglobalconsulting.testdanny.interfaces.EmployeeFactoryMethod;

public class EmployeeFactory implements EmployeeFactoryMethod {
	private final String hourlySalaryEmployee = "HourlySalaryEmployee";

	@Override
	public Employee createEmployee(int id, String name, String contractTypeName, int roleId, String roleName,
			String roleDescription, long hourlySalary, long monthlySalary) {
		
		if(contractTypeName.equals(hourlySalaryEmployee)) {
			return new HourlySalaryEmployee(id, name, contractTypeName, roleId, roleName, roleDescription, hourlySalary, monthlySalary);
		}
		
		return new MonthlySalaryEmployee(id, name, contractTypeName, roleId, roleName, roleDescription, hourlySalary, monthlySalary);
	}

}
