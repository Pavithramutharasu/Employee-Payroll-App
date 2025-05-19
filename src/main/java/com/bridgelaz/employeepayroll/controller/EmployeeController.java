package com.bridgelaz.employeepayroll.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelaz.employeepayroll.dto.EmployeeDTO;
import com.bridgelaz.employeepayroll.service.EmployeeService;

@RestController
@RequestMapping("/employeepay")
public class EmployeeController {
	
	@Autowired
	private EmployeeService es;
	@GetMapping("/{id}")
	public EmployeeDTO employeeDetail(@PathVariable long id) {
		return es.getEmployeeById(id);
	}
	
	@GetMapping("/")
	public List<EmployeeDTO> getAllEmployees() {
		return es.getAllEmployees();
	}
	
	@PostMapping("/create")
	public EmployeeDTO createEmployee(@RequestBody EmployeeDTO emp) {
		return es.createEmployee(emp);
	}
	
	@PutMapping("/update/{id}")
	public EmployeeDTO updateEmployee(@PathVariable long id ,@RequestBody EmployeeDTO emp) {
		return es.updateEmployee(id, emp);
	}
	
	@DeleteMapping("/delete/{id}")
	public boolean deleteEmployee(@PathVariable long id) {
		return es.deleteEmployee(id);
	}
	
}