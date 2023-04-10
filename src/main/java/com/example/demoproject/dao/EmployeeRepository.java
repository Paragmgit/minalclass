package com.example.demoproject.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demoproject.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

}
