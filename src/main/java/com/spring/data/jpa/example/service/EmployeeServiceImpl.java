package com.spring.data.jpa.example.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.data.jpa.example.repository.entity.Employee;

@Service
@Transactional(readOnly = true)
public class EmployeeServiceImpl implements EmployeeService {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Employee> getEmployeeList() {
        return entityManager.createQuery("SELECT e FROM Employee e",
                                        Employee.class).getResultList();
    }
}