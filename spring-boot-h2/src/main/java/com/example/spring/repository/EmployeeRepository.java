package com.example.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.spring.entity.Employee;
@Repository
public interface EmployeeRepository extends CrudRepository<Employee,Long> {

}
