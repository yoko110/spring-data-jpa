package com.spring.data.jpa.example.service;

import java.util.List;

import com.spring.data.jpa.example.repository.entity.Employee;

public interface EmployeeService {
    public List<Employee> getEmployeeList();
}