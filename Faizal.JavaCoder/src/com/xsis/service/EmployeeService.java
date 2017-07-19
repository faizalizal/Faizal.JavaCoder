package com.xsis.service;

import java.util.List;

import com.xsis.Entity.Employee;
import com.xsis.dao.EmployeeDAO;
import com.xsis.dao.EmployeeDaoEmpl;


public class EmployeeService {
	
	EmployeeDAO dao = new EmployeeDaoEmpl();
	
	public List<Employee> getAllEmployee(){
		return dao.getAllEmployee();
	}
}
