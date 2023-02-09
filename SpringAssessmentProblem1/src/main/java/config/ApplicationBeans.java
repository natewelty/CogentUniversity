package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import model.Employee;

@Configuration
public class ApplicationBeans {

	@Bean(name = "employee")
	public Employee getEmployee() {
		Employee employee = new Employee();
		employee.setEmpId(1);
		employee.setEmpName("John");
		employee.setEmpSal(123.45);
		return employee;
	}
}
