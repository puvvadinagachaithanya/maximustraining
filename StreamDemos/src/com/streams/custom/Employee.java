package com.streams.custom;

public class Employee {
	private String empName;
	private Integer empId;
	private double salary;
	private String city;
	public Employee() {
		super();
	}
	public Employee(String empName, Integer empId, double salary, String city) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.salary = salary;
		this.city = city;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empId=" + empId + ", salary=" + salary + ", city=" + city + "]";
	}
	
	
	
}
