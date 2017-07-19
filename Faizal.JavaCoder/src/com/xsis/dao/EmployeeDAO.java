package com.xsis.dao;

import java.util.List;

import com.xsis.Entity.Employee;

public interface EmployeeDAO {
	//insert
	public void save(Employee emp);
	//update
	public void update(int id, Employee emp);
	//delete
	public void delete(int id);
	//search by name
	public List<Employee> getEmployeeByName(String name);
	//getAll
	public List<Employee> getAllEmployee();
	//search by email
	public Employee searchEmployeeEmail(String email);
}
