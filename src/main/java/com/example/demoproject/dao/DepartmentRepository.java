package com.example.demoproject.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demoproject.model.Department;

public interface DepartmentRepository extends JpaRepository<Department,Integer>{

}
