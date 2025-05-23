package com.bridgelaz.employeepayroll.dto;

public class EmployeeDTO {
	private long id;
    
    private String name;

    private double salary;
    public EmployeeDTO() {}
    public EmployeeDTO(long id, String name, double salary) {
    	this.id = id;
        this.name = name;
        this.salary = salary;
    }
    
    public long getId() { return id; }
    public void setId(long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }
}
