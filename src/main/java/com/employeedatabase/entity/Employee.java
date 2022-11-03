package com.employeedatabase.entity;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long empId;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private String email;
    private Long phoneNumber;
    private String photoPath;


}
