package com.masglobalconsulting.testdanny.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.masglobalconsulting.testdanny.dto.Employee;
import com.masglobalconsulting.testdanny.service.EmployeeService;

@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;

	
	@RequestMapping(value = "/getemployees", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<Employee> getEmployees() {
		List<Employee> employees = this.employeeService.getAllEmployees();
		return employees;		
	}
	
	@RequestMapping(value = "/getemployee", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public  Employee getEmployee(@RequestParam int id) {
		Employee employee = this.employeeService.getEmployeeById(id);
		return employee;		
	}
}
