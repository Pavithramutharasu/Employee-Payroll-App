package com.bridgelaz.employeepayroll.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.bridgelaz.employeepayroll.dto.EmployeeDTO;
import com.bridgelaz.employeepayroll.mapper.EmployeeMapper;
import com.bridgelaz.employeepayroll.model.EmployeeModel;

@Service
public class EmployeeService {

    private List<EmployeeModel> employeeList = new ArrayList<>();
    private long idCounter = 1;

    private final EmployeeMapper mapper = new EmployeeMapper();

    // Get all employees
    public List<EmployeeDTO> getAllEmployees() {
        return mapper.entityToDTOList(employeeList);
    }

    // Get employee by ID
    public EmployeeDTO getEmployeeById(long id) {
        return employeeList.stream()
                .filter(emp -> emp.getId() == id)
                .findFirst()
                .map(mapper::entitytodto)
                .orElse(null);
    }

    // Create new employee
    public EmployeeDTO createEmployee(EmployeeDTO dto) {
        EmployeeModel employee = mapper.dtoToEntity(dto);
        employee.setId(idCounter++);
        employeeList.add(employee);
        return mapper.entitytodto(employee);
    }

    // Update existing employee
    public EmployeeDTO updateEmployee(long id, EmployeeDTO dto) {
        Optional<EmployeeModel> optionalEmp = employeeList.stream()
                .filter(emp -> emp.getId() == id)
                .findFirst();

        if (optionalEmp.isPresent()) {
            EmployeeModel emp = optionalEmp.get();
            emp.setName(dto.getName());
            emp.setSalary(dto.getSalary());
            return mapper.entitytodto(emp);
        }

        return null;
    }

    // Delete employee by ID
    public boolean deleteEmployee(long id) {
        return employeeList.removeIf(emp -> emp.getId() == id);
    }
}