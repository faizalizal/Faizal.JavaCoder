package com.xsis.controller;

import java.util.List;

import com.xsis.Entity.Employee;
import com.xsis.dao.EmployeeDaoEmpl;
import com.xsis.service.EmployeeService;

public class Main {
	static EmployeeDaoEmpl dao = new EmployeeDaoEmpl();
	
	public static void save(){
		Employee emp = new Employee(0, "Faizal", "Jalan", 1000.0, "03845734");
		dao.save(emp);
	}
	
	public static void delete(){
		dao.delete(5);
	}
	
	public static void update(){
		Employee emp = new Employee();
		emp.setName("icaal");
		emp.setAddress("Jalan dua");
		emp.setSalary(2640.0);
		emp.setNohp("08987894321");
		dao.update(7, emp);
	}
	public static void getAll(){
		List<Employee> listData = dao.getAllEmployee();
		for (Employee data : listData) {
			System.out.println("Nama : " + data.getName());
			System.out.println("Address : " + data.getAddress());
			System.out.println("Salary : " + data.getSalary());
			System.out.println("NoHP : " + data.getNohp());
			System.out.println();
		}
	}
	public static void getByName(){
		List<Employee> listData = dao.getEmployeeByName("Faizal");
		for (Employee data : listData) {
			System.out.println("Nama : " + data.getName());
			System.out.println("Address : " + data.getAddress());
			System.out.println("Salary : " + data.getSalary());
			System.out.println("NoHP : " + data.getNohp());
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		EmployeeService as = new EmployeeService();
		List<Employee> listEmp = as.getAllEmployee();
		for (Employee data : listEmp) {
			System.out.println("Nama : " + data.getName());
			System.out.println("Address : " + data.getAddress());
			System.out.println("Salary : " + data.getSalary());
			System.out.println("NoHP : " + data.getNohp());
			System.out.println();
		}
	}
}
