package com.list.assignments;

public class Employee {
	private String empName;
	private String department;
	private String city;
	public Employee() {
		
	}
	public Employee(String empName, String department, String city) {
		super();
		this.empName = empName;
		this.department = department;
		this.city = city;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", department=" + department + ", city=" + city + "]";
	}
	
	
}
