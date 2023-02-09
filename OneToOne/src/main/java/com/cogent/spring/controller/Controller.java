package com.cogent.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cogent.spring.entity.Employee;
import com.cogent.spring.repo.EmployeeRepo;

@RestController
public class Controller {
	@Autowired
	private EmployeeRepo er;
	
	@GetMapping("/employees")
	public List<Employee> fetchEmployeeList(){
		return er.findAll();
	}
	
	@PostMapping("/employees")
	public Employee saveEmployee(@RequestBody Employee employee) {
		return er.save(employee);
	}
}
