package com.codesnippet.springdemoapplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codesnippet.springdemoapplication.dto.EmployeeDTO;
import com.codesnippet.springdemoapplication.entity.Employee;
import com.codesnippet.springdemoapplication.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	
	/* 1
	public String getEmployee(Integer Id) {
		System.out.println("Inside service getEmployee method");
		String employee = employeeRepository.getEmployee(Id);
		return employee;
	}*/
	
	public EmployeeDTO getEmployee(Integer Id) {
		System.out.println("Inside service getEmployee method");
		Employee employee = employeeRepository.getEmployee(Id);
		EmployeeDTO employeeDTO = new EmployeeDTO();
		return employeeDTO.EmployeeMapper(employee);
	}
}
