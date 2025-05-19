package com.bridgelaz.employeepayroll.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelaz.employeepayroll.model.EmployeeModel;

@RestController
@RequestMapping("/employeepay")
public class EmployeeController {
	
	@GetMapping("/{id}")
	public String employeeDetail(@PathVariable long id) {
		return "Employee details with id : " +  id;
	}
	
	@GetMapping("/")
	public String getAllEmployees() {
		return "Getting all employee data " ;
	}
	
	@PostMapping("/create")
	public String createEmployee(@RequestBody EmployeeModel emp) {
		return "Employee created with Name : " +emp.getName();
	}
	
	@PutMapping("/update/{id}")
	public String updateEmployee(@RequestBody EmployeeModel emp) {
		return "Employee updated with Name : " +emp.getName();
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteEmployee(@PathVariable long id) {
		return "Employee deleted with id : " + id;
	}
	
}