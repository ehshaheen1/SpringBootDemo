package com.shaheen.springboot.springbootcruddemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.shaheen.springboot.springbootcruddemo.dao.EmployeeDAO;
import com.shaheen.springboot.springbootcruddemo.entity.Employee;
@Service
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeDAO employeeDAO;
    @Autowired
	public EmployeeServiceImpl(EmployeeDAO theEmployeeDAO) {
    	employeeDAO=theEmployeeDAO;
	}

	@Override
	@Transactional
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return employeeDAO.getAllEmployee();
	}

	@Override
	@Transactional
	public Employee getEmployeeById(int empid) {
		
		return employeeDAO.getEmployeeById(empid);
		 
	}

	@Override
	@Transactional
	public void addEmployee(Employee addEmoployee) {
		  employeeDAO.addEmployee(addEmoployee);
		
	}

	@Override
	@Transactional
	public Employee updateEmployee(Employee updateEmployee) {
		// TODO Auto-generated method stub
		return employeeDAO.updateEmployee(updateEmployee);
	}

	@Override
	@Transactional
	public void deleteEmployee(int employeeId) {
		// TODO Auto-generated method stub
		employeeDAO.deleteEmployee(employeeId);
		
	}
}
