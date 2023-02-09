package com.cogent.spring.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cogent.spring.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee,Integer>{

}
