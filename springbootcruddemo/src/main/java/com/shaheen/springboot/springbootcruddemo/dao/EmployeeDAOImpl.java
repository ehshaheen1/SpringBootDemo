package com.shaheen.springboot.springbootcruddemo.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.shaheen.springboot.springbootcruddemo.entity.Employee;
@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
	
	private EntityManager entityManager;
	@Autowired
	public EmployeeDAOImpl(EntityManager theEntityManager)
	{
		entityManager=theEntityManager;
	}

	@Override
	public List<Employee> getAllEmployee() {
		Session currentSession=entityManager.unwrap(Session.class);
		Query<Employee> listOfEmployee=currentSession.createQuery("from Employee", Employee.class);
		
		List<Employee> employeeList=listOfEmployee.getResultList();
		return employeeList;
	}

	@Override
	public Employee getEmployeeById(int empId) {
		
		
		Session currentSession=entityManager.unwrap(Session.class);
		Employee getEmployee=currentSession.get(Employee.class,empId);
		return getEmployee;
	}

	@Override
	public void addEmployee(Employee addEmoployee) {
		// TODO Auto-generated method stub
	Session currentSession = entityManager.unwrap(Session.class);
	currentSession.save(addEmoployee);
		
	}

	@Override
	public Employee updateEmployee(Employee updateEmployee) {
		// TODO Auto-generated method stub
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(updateEmployee);
		
		return updateEmployee;
	}

	@Override
	public void deleteEmployee(int employeeId) {
		// TODO Auto-generated method stub
		
	Session currentSession = entityManager.unwrap(Session.class);
	Query deleteEmployee =currentSession.createQuery(
			"delete from Employee where id=:empId");
	deleteEmployee.setParameter("empId", employeeId);
	deleteEmployee.executeUpdate();
		
		
	}
	
	

}
