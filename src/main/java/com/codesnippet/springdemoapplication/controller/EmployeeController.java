package com.codesnippet.springdemoapplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.codesnippet.springdemoapplication.dto.EmployeeDTO;
import com.codesnippet.springdemoapplication.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;

	/* 1
	@GetMapping("/getEmployee/{id}")
	public ResponseEntity<String> getEmployee(@PathVariable Integer id){
		System.out.println("Inside controller getEmployee method");
		String employee = employeeService.getEmployee(id);
		return ResponseEntity.ok(employee);
	}*/
	
	@GetMapping("/getEmployee/{id}")
	public ResponseEntity<EmployeeDTO> getEmployee(@PathVariable Integer id){
		System.out.println("Inside controller getEmployee method");
		EmployeeDTO employeeDTO = employeeService.getEmployee(id);
		return ResponseEntity.ok(employeeDTO);
	}
}
