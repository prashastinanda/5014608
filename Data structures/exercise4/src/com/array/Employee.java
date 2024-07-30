package com.array;

public class Employee {

	private String employeeId;
	private String name;
	private String position;
	private double salary;
	
	public Employee(String id, String name, String pos, double sal) {
		this.employeeId = id;
		this.name = name;
		this.position = pos;
		this.salary = sal;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}
