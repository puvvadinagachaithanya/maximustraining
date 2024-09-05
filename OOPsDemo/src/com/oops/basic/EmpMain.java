package com.oops.basic;

public class EmpMain {

	public static void main(String[] args) {
		Employee employee = new Employee("Chaitu", 10000);
		employee.getDetails();
		String result = employee.greet("Java training");
		System.out.println(result);

		Employee newEmployee = new Employee("Puvvadi", 25000);
		newEmployee.getDetails();
		System.out.println(newEmployee.greet("Java training"));
	}
}
