package com.codesnippet.springdemoapplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codesnippet.springdemoapplication.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	
	public String getEmployee(Integer Id) {
		System.out.println("Inside service getEmployee method");
		String employee = employeeRepository.getEmployee(Id);
		return employee;
	}
	
}
