package com.codesnippet.springdemoapplication.repository;

import org.springframework.stereotype.Repository;

import com.codesnippet.springdemoapplication.entity.Employee;

@Repository
public class EmployeeRepository {

	/* 1
	public String getEmployee(Integer id) {
		System.out.println("Inside repository getEmployee method");
		return "emp";
	}*/
	
	public Employee getEmployee(Integer id) {
		System.out.println("Inside repository getEmployee method");
		return new Employee(1, "Mani", "IT", "27");
	}
}
