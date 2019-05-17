package com.springboot.springbootcrud.dao;

import com.springboot.springbootcrud.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
	
	List<Employee> findAll();
	
	Employee findById(int id);
	
	void save(Employee employee);
	
	void deleteById(int id);
}
