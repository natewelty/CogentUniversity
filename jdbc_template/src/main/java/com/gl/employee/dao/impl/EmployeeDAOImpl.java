package com.gl.employee.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.gl.employee.dao.EmployeeDAO;
import com.gl.employee.model.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {

	private JdbcTemplate jdbcTemplate;

	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public void insert(Employee employee) {

		String sql = "INSERT INTO EMPLOYEE " + "(EMPLOYEE_ID, EMP_NAME, AGE,SALARY) VALUES (?, ?, ?,?)";

		jdbcTemplate.update(sql,
				new Object[] { employee.getEmployeeId(), employee.getName(), employee.getAge(), employee.getSalary() });

	}

	public void delete(int employeeID) {
		String sql = "delete from EMPLOYEE where EMPLOYEE_ID = ?;";
		jdbcTemplate.update(sql, new Object[] { employeeID });
	}

	public void update(Employee employee) {
		String sql = "update EMPLOYEE set EMP_NAME = ?, AGE = ?, SALARY = ? where EMPLOYEE_ID = ?;";
		jdbcTemplate.update(sql,
				new Object[] { employee.getName(), employee.getAge(), employee.getSalary(), employee.getEmployeeId() });
	}

	public Employee readEmployee(int employeeID) {
		return jdbcTemplate.query("select * from EMPLOYEE where EMPLOYEE_ID = ?",new Object[] {employeeID}, new ResultSetExtractor<Employee>() {
			public Employee extractData(ResultSet rs) throws SQLException, DataAccessException {

				rs.next();
				Employee e = new Employee(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4));

				return e;
			}
		});
	}

	public List<Employee> readAll() {
		return jdbcTemplate.query("select * from EMPLOYEE", new ResultSetExtractor<List<Employee>>() {
			public List<Employee> extractData(ResultSet rs) throws SQLException, DataAccessException {
				List<Employee> list = new ArrayList<Employee>();
				while(rs.next()) {
				Employee e = new Employee(rs.getInt(1), rs.getString(2),rs.getInt(3),rs.getInt(4));
				list.add(e);
				}
				return list;
			}
		});
	}

}	
