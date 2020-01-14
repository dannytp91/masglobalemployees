package com.masglobalconsulting.testdanny.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.masglobalconsulting.testdanny.dto.Employee;
import com.masglobalconsulting.testdanny.dto.EmployeeFactory;
import com.masglobalconsulting.testdanny.dto.EmployeeMapper;

@Service
public class EmployeeService {
	
	@Autowired
	RestTemplate restTemplate;
	
	final String url = "http://masglobaltestapi.azurewebsites.net/api/employees";
	
	public List<Employee> getAllEmployees() {
		return this.repositoryEmployees();
	}
	
	public Employee getEmployeeById(int id) {
		List<Employee> employees = this.repositoryEmployees();
		Employee employee = null;
		for(Employee employeeItem: employees) {
			if(employeeItem.getId() == id) {
				employee = employeeItem;
			}
		}
		return employee;
	}
	
	private List<Employee> repositoryEmployees() {
		EmployeeMapper[] employeesMapper = restTemplate.getForObject(url, EmployeeMapper[].class);
		ArrayList<Employee> employees = new ArrayList<Employee>();
		for(EmployeeMapper employeeMapper : employeesMapper) {
			employees.add(new EmployeeFactory().createEmployee(
					employeeMapper.getId(),
					employeeMapper.getName(),
					employeeMapper.getContractTypeName(),
					employeeMapper.getRoleId(),
					employeeMapper.getRoleName(),
					employeeMapper.getRoleDescription(),
					employeeMapper.getHourlySalary(),
					employeeMapper.getMonthlySalary()
				)
			);
		}
		return employees;
	}
}
