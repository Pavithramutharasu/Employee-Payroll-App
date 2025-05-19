package com.bridgelaz.employeepayroll.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelaz.employeepayroll.model.EmployeeModel;
import com.bridgelaz.employeepayroll.service.EmployeeService;

@RestController
@RequestMapping("/employeepay")
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;

	@GetMapping("/{id}")
	public String employeeDetail(@PathVariable long id) {
	    return service.getEmployeeById(id);
	}

	@GetMapping("/")
	public String getAllEmployees() {
	    return service.getAllEmployees();
	}

	@PostMapping("/create")
	public String createEmployee(@RequestBody EmployeeModel emp) {
	    return service.createEmployee(emp);
	}

	@PutMapping("/update/{id}")
	public String updateEmployee(@RequestBody EmployeeModel emp) {
	    return service.updateEmployee(emp);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteEmployee(@PathVariable long id) {
	    return service.deleteEmployee(id);
	}

}