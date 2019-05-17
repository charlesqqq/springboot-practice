package com.springboot.springbootcrud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;

@Controller
public class DemoController {
	
	@GetMapping("/hello")
	public String hello(Model model) {
		model.addAttribute("time", LocalDateTime.now());
		return "hello";
	}
	
}
