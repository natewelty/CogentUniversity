package com.cogent;

import java.io.Serializable;

public class Employee implements Serializable {
	int id;
	String name;
	int salary;
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	
}
