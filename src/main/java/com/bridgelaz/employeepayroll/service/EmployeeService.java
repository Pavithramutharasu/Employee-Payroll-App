package com.bridgelaz.employeepayroll.service;

import org.springframework.stereotype.Service;

import com.bridgelaz.employeepayroll.model.EmployeeModel;

@Service
public class EmployeeService {

    public String getEmployeeById(long id) {
        return "Employee details with id : " + id;
    }

    public String getAllEmployees() {
        return "Getting all employee data";
    }

    public String createEmployee(EmployeeModel emp) {
        return "Employee created with Name : " + emp.getName();
    }

    public String updateEmployee(EmployeeModel emp) {
        return "Employee updated with Name : " + emp.getName();
    }

    public String deleteEmployee(long id) {
        return "Employee deleted with id : " + id;
    }
}
