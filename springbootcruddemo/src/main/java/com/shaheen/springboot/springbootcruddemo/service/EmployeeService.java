package com.shaheen.springboot.springbootcruddemo.service;

import java.util.List;

import com.shaheen.springboot.springbootcruddemo.entity.Employee;

public interface EmployeeService {

	public List<Employee> getAllEmployee();
	public Employee getEmployeeById(int empid);
	public void addEmployee(Employee addEmoployee);
	public Employee updateEmployee(Employee updateEmployee);
	public void deleteEmployee(int employeeId);
}
