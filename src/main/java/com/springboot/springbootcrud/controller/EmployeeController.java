package com.springboot.springbootcrud.controller;

import com.springboot.springbootcrud.entity.Employee;
import com.springboot.springbootcrud.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/")
	public String findAll(Model model) {
		model.addAttribute("employees", employeeService.findAll());
		return "employees-table";
	}
	
	@GetMapping("/showFormForCreate")
	public String showFormForCreate(Model model) {
		model.addAttribute("employee", new Employee());
		return "employee-form";
	}
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(int id, Model model) {
		model.addAttribute("employee", employeeService.findById(id));
		return "employee-form";
	}
	
	@PostMapping("/save")
	public String save(@ModelAttribute("employee") Employee employee) {
		employeeService.save(employee);
		return "redirect:/";
	}
	
	@GetMapping("/delete")
	public String delete(int id) {
		employeeService.deleteById(id);
		return "redirect:/";
	}
}
