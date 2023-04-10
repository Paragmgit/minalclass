package com.example.demoproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoproject.model.Employee;
import com.example.demoproject.service.EmployeeService;

@RestController
@RequestMapping(value = "/api/employee")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("/create-emp")
	public ResponseEntity<String> createEmp(@RequestBody Employee empData){
	    employeeService.createEmp(empData);
		return new ResponseEntity<String>("saved employee",HttpStatus.CREATED);
	}
	
	@GetMapping("get-all")
	public List<Employee> getAll(){
		return employeeService.getEmp();
	}
	
}
