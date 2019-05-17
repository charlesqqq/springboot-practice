package com.springboot.springbootcrud.service;

import com.springboot.springbootcrud.dao.EmployeeRepository;
import com.springboot.springbootcrud.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class EmployeeServiceImp implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public List<Employee> findAll() {
		return employeeRepository.findAllByOrderByFirstNameDesc();
	}

	@Override
	public Employee findById(int id) {
		Optional<Employee> optional = employeeRepository.findById(id);
		if (optional.isPresent())
			return optional.get();
		throw new RuntimeException("Can not find Employee with id " + id);
	}

	@Override
	public void save(Employee employee) {
		employeeRepository.save(employee);
	}

	@Override
	public void deleteById(int id) {
		employeeRepository.deleteById(id);
	}
}
