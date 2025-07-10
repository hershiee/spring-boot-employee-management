package com.harshita.employee_management;

import com.harshita.employee_management.model.Employee;
import com.harshita.employee_management.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeManagementApplication implements CommandLineRunner {

	@Autowired
	private EmployeeRepository employeeRepository;

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementApplication.class, args);
	}

	@Override
	public void run(String... args) {
		Employee emp1 = new Employee(null, "Harshita Gupta", "harshita@example.com", "Software");
		employeeRepository.save(emp1);
		System.out.println("✅ Data inserted: " + emp1);
	}
}
