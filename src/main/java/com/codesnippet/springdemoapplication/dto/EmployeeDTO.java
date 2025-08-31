package com.codesnippet.springdemoapplication.dto;

import com.codesnippet.springdemoapplication.entity.Employee;

public class EmployeeDTO {

	String name;
	String dept;
	String age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	public EmployeeDTO EmployeeMapper(Employee employee) {
		this.setName(employee.getName());
		this.setDept(employee.getDept());
		this.setAge(employee.getAge());
		return this;
	}
	
}
