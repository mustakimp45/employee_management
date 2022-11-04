package com.employeedatabase.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.employeedatabase.entity.Employee;
import com.employeedatabase.repository.EmployeeRepository;
import com.employeedatabase.service.EmployeeService;

@RestController
@RequestMapping("/")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeservice;
	
	@RequestMapping(method=RequestMethod.POST,value="/register")
	public void addEmployee(@RequestBody Employee employee)
	{
		employeeservice.addEmployee(employee);
System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	}
	
//	@PutMapping("/update/{empId}")
//   public void updateEmployee(@RequestBody Employee employee, @PathVariable Long empId)
//    {
////		employeeservice.findbyUserEmpId(empId);
//         employeeservice.updateUser(employee,empId);
//        
//    }
}
