package com.jdbc.basics;

public class Employee {
	private String name;
	private int empId;
	private String city;

	public Employee() {
		
	}
	public Employee(String name, int empId, String city) {
		super();
		this.name = name;
		this.empId = empId;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", empId=" + empId + ", city=" + city + "]";
	}

}
