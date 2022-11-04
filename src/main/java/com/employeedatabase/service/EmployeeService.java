package com.employeedatabase.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.employeedatabase.entity.Employee;
import com.employeedatabase.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	EmployeeRepository employeeRepository;
	
	public void addEmployee(Employee employee) {
System.out.println("********************************************************************************************");
		employeeRepository.save(employee);

	}
	
//	public void findbyUserEmpId(Long empId){
//         employeeRepository.findById(empId);
//    }

//    
//    public void updateUser(Employee employee, Long empId) {
//        
//         employeeRepository.save(employee);
//    }
//	
}
