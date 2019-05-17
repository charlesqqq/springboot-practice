//package com.springboot.springbootcrud.rest;
//
//import com.springboot.springbootcrud.entity.Employee;
//import com.springboot.springbootcrud.service.EmployeeService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api")
//public class EmployeeRestController {
//
//	@Autowired
//	private EmployeeService employeeService;
//
//	@GetMapping("/employees")
//	public List<Employee> findAll() {
//		return employeeService.findAll();
//	}
//
//	@GetMapping("/employees/{id}")
//	public Employee findById(@PathVariable int id) {
//		return employeeService.findById(id);
//	}
//
//	@PostMapping("/employees")
//	public Employee save(@RequestBody Employee employee) {
//		employeeService.save(employee);
//		return employee;
//	}
//
//	@PutMapping("/employees")
//	public Employee update(@RequestBody Employee employee) {
//		employeeService.save(employee);
//		return employee;
//	}
//
//	@DeleteMapping("/employees/{id}")
//	public void deleteById(@PathVariable int id) {
//		employeeService.deleteById(id);
//	}
//}
