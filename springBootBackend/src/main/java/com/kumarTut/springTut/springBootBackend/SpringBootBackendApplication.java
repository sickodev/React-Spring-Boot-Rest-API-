package com.kumarTut.springTut.springBootBackend;

import com.kumarTut.springTut.springBootBackend.entity.Employee;
import com.kumarTut.springTut.springBootBackend.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBackendApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
		Employee employee1 = Employee.builder().
				fName("Kumar").
				lName("Kalyan").
				email("kumar@hotmail.com").
				build();
		Employee employee2 = Employee.builder().
				fName("John").
				lName("Wayne").
				email("wayne93@hotmail.com").
				build();
		Employee employee3 = Employee.builder().
				fName("Drew").
				lName("Hobius").
				email("hobiusdrew@hotmail.com").
				build();

		employeeRepository.save(employee1);
		employeeRepository.save(employee2);
		employeeRepository.save(employee3);
	}
}
