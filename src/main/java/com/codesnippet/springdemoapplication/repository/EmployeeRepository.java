package com.codesnippet.springdemoapplication.repository;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepository {

	public String getEmployee(Integer id) {
		System.out.println("Inside repository getEmployee method");
		return "emp";
	}
	
}
