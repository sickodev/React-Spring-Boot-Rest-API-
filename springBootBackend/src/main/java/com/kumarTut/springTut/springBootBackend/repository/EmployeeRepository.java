package com.kumarTut.springTut.springBootBackend.repository;

import com.kumarTut.springTut.springBootBackend.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
