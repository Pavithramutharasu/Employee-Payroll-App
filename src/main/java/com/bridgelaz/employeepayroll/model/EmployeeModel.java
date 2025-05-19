package com.bridgelaz.employeepayroll.model;

public class EmployeeModel {
	private long id;

    private String name;

    private double salary;
    
    public EmployeeModel() {}

    public EmployeeModel(long id, String name, double salary) {
    	this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public long getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

}
