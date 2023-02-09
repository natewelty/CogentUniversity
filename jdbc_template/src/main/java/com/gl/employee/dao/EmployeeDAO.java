package com.gl.employee.dao;

import java.util.List;

import com.gl.employee.model.Employee;

public interface EmployeeDAO 
{
	public void insert(Employee employee);
	public void delete(int EmployeeID);
	public void update(Employee employee);
	public Employee readEmployee(int EmployeeID);
	public List<Employee> readAll();
}