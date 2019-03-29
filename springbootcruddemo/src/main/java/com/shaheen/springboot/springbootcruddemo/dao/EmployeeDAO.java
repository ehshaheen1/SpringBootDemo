package com.shaheen.springboot.springbootcruddemo.dao;

import java.util.List;

import com.shaheen.springboot.springbootcruddemo.entity.Employee;

public interface EmployeeDAO {

	public List<Employee> getAllEmployee();
	public Employee getEmployeeById(int empId);
	public void addEmployee(Employee addEmoployee);
	public Employee updateEmployee(Employee updateEmployee);
	public void deleteEmployee(int employeeId);
	
}
