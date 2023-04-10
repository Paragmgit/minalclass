package com.example.demoproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoproject.dao.EmployeeRepository;
import com.example.demoproject.model.Employee;

@Service
public class EmployeeService {
	
	@Autowired
    EmployeeRepository employeeRepository;
	
	public void createEmp(Employee empData) {
		employeeRepository.save(empData);
	}

	public List<Employee> getEmp() {
		
		return employeeRepository.findAll();
	}

}
