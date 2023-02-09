package com.gl.core;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gl.employee.dao.EmployeeDAO;
import com.gl.employee.model.Employee;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		EmployeeDAO employeeDAO = (EmployeeDAO) context.getBean("employeeDAO");
		Employee employee = new Employee(1, "Gyanendra", 40, 3000000);
		employeeDAO.insert(employee);
		System.out.println("Employee record inserted successfully.");
		employeeDAO.insert(new Employee(2, "Nate", 29, 3000000));
		employeeDAO.insert(new Employee(3, "John", 20, 5000));
		employeeDAO.insert(new Employee(4, "Jacob", 22, 300));
		System.out.println("Many employee records inserted successfully.");
		Employee readEmployee = employeeDAO.readEmployee(3);
		System.out.println("We read an employee: " + readEmployee);
		employeeDAO.update(new Employee(3,"Jingleheimer", 21, 5050));
		System.out.println(employeeDAO.readEmployee(3));
		employeeDAO.delete(3);
		List<Employee> list = employeeDAO.readAll();
		for(Employee e:list) {
			System.out.println(e);
		}
	}
}
s