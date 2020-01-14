package com.masglobalconsulting.testdanny.interfaces;

import com.masglobalconsulting.testdanny.dto.Employee;

public interface EmployeeFactoryMethod {
	public Employee createEmployee(int id, String name, String contractTypeName, int roleId, String roleName, String roleDescription,
			long hourlySalary, long monthlySalary);
}
