package com.cogent.DAO;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import com.cogent.entity.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee,Long>{

}
