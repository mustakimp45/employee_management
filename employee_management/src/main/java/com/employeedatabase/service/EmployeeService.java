package com.employeedatabase.service;

import org.springframework.stereotype.Service;

import com.employeedatabase.entity.Employee;
import com.employeedatabase.repository.EmployeeRepository;
@Service
public class EmployeeService {
 
	EmployeeRepository employeerepository;
	
	public void updateEmployee(long empId,Employee employee) {

		employeerepository.save(employee);

	}
	 
}