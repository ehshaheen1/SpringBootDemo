package com.shaheen.springboot.springbootcruddemo.rest;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shaheen.springboot.springbootcruddemo.entity.Employee;
import com.shaheen.springboot.springbootcruddemo.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
	private EmployeeService employeeService;
    
	@Autowired
	public EmployeeRestController(EmployeeService TheemployeeService)
	{
		employeeService=TheemployeeService;	
	}
	@GetMapping("/employees")
	public List<Employee> getAllEmployee()
	{
		List<Employee> listAllEmployee=employeeService.getAllEmployee();
		
		return listAllEmployee;
	}
	
	@GetMapping("/employees/{empId}")
	
	public Employee getEmployeeByID(@PathVariable int empId)
	{ 
		
		Employee emp= employeeService.getEmployeeById(empId);
		return emp;
		
		
	}
	
	@PostMapping("/employees")
	public void addEmployee(@RequestBody Employee employee)
	{
		
		employeeService.addEmployee(employee);
	}
	
	@PutMapping("/employees")
	public Employee updateEmployee(@RequestBody Employee updateEmployee)
	{
		  Employee updateEmp =employeeService.updateEmployee(updateEmployee);
		return updateEmp;
	}
	
	@DeleteMapping("/employees/{employeeId}")
	public String deleteEmployee(@PathVariable int employeeId)
	{
		employeeService.deleteEmployee(employeeId);
		
		return "Deleted employee id - " + employeeId;
		
	}
	
	
	
	
}
