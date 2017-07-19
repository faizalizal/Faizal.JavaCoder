package com.xsis.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.xsis.Connection.Koneksi;
import com.xsis.Entity.Employee;

public class EmployeeDaoEmpl implements EmployeeDAO {

	Connection conn = Koneksi.getConnect();
	private static final String SQL_SAVE = "INSERT INTO EMPLOYEE VALUES(XSIS_SQUENCE.nextval,?,?,?,?)";
	private static final String SQL_GETALLEMPLOYEE = "SELECT * FROM EMPLOYEE";
	private static final String SQL_DELETE = "DELETE FROM EMPLOYEE WHERE id = ?";
	private static final String SQL_UPDATE = "UPDATE employee set name = ? , address = ? , salary = ? , nohp = ? where id = ?";
	private static final String SQL_GETEMPLOYEEBYNAME = "SELECT * FROM EMPLOYEE WHERE NAME = ?";
	@Override
	public void save(Employee emp) {
		// TODO Auto-generated method stub
		PreparedStatement ps = Koneksi.getPreparedStatement(SQL_SAVE, conn);
		try {
			ps.setString(1, emp.getName());
			ps.setString(2, emp.getAddress());
			ps.setDouble(3, emp.getSalary());
			ps.setString(4, emp.getNohp());
			ps.executeUpdate();
			System.out.println("Data berhasil disimpan");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

	@Override
	public void update(int id, Employee emp) {
		// TODO Auto-generated method stub
		PreparedStatement ps = Koneksi.getPreparedStatement(SQL_UPDATE, conn);
		try {
			ps.setString(1, emp.getName());
			ps.setString(2, emp.getAddress());
			ps.setDouble(3, emp.getSalary());
			ps.setString(4, emp.getNohp());
			ps.setInt(5, id);
			ps.executeUpdate();
			System.out.println("Data terupdate");
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		PreparedStatement ps = Koneksi.getPreparedStatement(SQL_DELETE, conn);
		try {
			ps.setInt(1, id);
			ps.executeUpdate();
			System.out.println("Data terhapus");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

	@Override
	public List<Employee> getEmployeeByName(String name) {
		// TODO Auto-generated method stub
		List<Employee> listEmp  = new ArrayList<>();
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			ps = Koneksi.getPreparedStatement(SQL_GETEMPLOYEEBYNAME, conn);
			ps.setString(1, name);
			rs = ps.executeQuery();
			while (rs.next()) {
				Employee emp = new Employee();
				emp.setName(rs.getString("name"));
				emp.setAddress(rs.getString("address"));
				emp.setSalary(rs.getDouble("salary"));
				emp.setNohp(rs.getString("nohp"));
				listEmp.add(emp);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return listEmp;
	}

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		List<Employee> listEmp  = new ArrayList<>();
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			ps = Koneksi.getPreparedStatement(SQL_GETALLEMPLOYEE, conn);
			rs = ps.executeQuery();
			while (rs.next()) {
				Employee emp = new Employee();
				emp.setName(rs.getString("name"));
				emp.setAddress(rs.getString("address"));
				emp.setSalary(rs.getDouble("salary"));
				emp.setNohp(rs.getString("nohp"));
				listEmp.add(emp);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return listEmp;
	}

	@Override
	public Employee searchEmployeeEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
