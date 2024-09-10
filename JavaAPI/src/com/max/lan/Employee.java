package com.max.lan;


public class Employee implements Cloneable {
	private String empName;
	private int empId;
	private double salary;

	public Employee() {
		super();
	}
	public Employee(String empName, int empId, double salary) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.salary = salary;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empId=" + empId + ", salary=" + salary + "]";
	}

}
