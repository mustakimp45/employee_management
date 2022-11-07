package com.employeedatabase.repository;

import org.springframework.data.repository.CrudRepository;

import com.employeedatabase.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee,Long>  {

}
