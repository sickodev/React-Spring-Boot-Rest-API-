package com.kumarTut.springTut.springBootBackend.controller;

import com.kumarTut.springTut.springBootBackend.entity.Employee;
import com.kumarTut.springTut.springBootBackend.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/* @RestController makes the class behave as a REST API */
@RestController

/* @RequestMapping makes the class receive requests */
@RequestMapping(path = "/api")

/* Puts the server on same port as react */
@CrossOrigin("http://localhost:3000/")

public class EmployeeController {
    @Autowired
    public EmployeeRepository employeeRepository;

    /* @GetMapping makes the class send requests. */
    @GetMapping(path = "/employees")
    public List<Employee> fetchEmployees(){
        return employeeRepository.findAll();
    }
}
