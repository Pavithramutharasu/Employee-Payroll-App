package com.bridgelaz.employeepayroll.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employeepay")
public class EmployeeController {
	
	@GetMapping("/")
	public String employeeDetail() {
		return "Employee Controller Testing";
	}
}