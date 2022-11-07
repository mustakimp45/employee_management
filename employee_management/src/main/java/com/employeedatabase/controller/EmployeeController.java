package com.employeedatabase.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.employeedatabase.entity.Employee;
import com.employeedatabase.service.EmployeeService;

public class EmployeeController {

	EmployeeService employeeService;
	
	@RequestMapping(method=RequestMethod.PUT,value="/employees/{id}")
	public void updateEmployee(@PathVariable long empId , @RequestBody Employee employee)
	{
		employeeService.updateEmployee(empId,employee);
	}
}
