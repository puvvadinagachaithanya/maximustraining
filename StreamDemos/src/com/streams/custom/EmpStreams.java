package com.streams.custom;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class EmpStreams {

	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(new Employee("Chaitu", 10, 85000, "Bangalore"),
				new Employee("Naresh", 12, 25000, "Hyderabad"), new Employee("Sujala", 15, 15000, "Chennai"),
				new Employee("Jaswik", 17, 75000, "Trivendrum"), new Employee("Harini", 19, 28000, "Bangalore"),
				new Employee("Surendra", 19, 50000, "Hyderabad"));

		// Get the list of employees by city - filter

		employees.stream().filter(emp -> emp.getCity().equals("Bangalore")).forEach(emp -> System.out.println(emp));

		System.out.println();

		// Get only employee names - map

		employees.stream().map(Employee::getEmpName).forEach(emp -> System.out.println(emp));

		// get the employees by salary > 20000

		employees.stream().filter(emp -> emp.getSalary() > 40000)
				.sorted((e1, e2) -> e1.getEmpName().compareTo(e2.getEmpName())).forEach(emp -> System.out.println(emp));

		System.out.println();
		// get the all employees sum of salaries

		double salarySum = employees.stream().mapToDouble(emp -> emp.getSalary()).sum();
		System.out.println(salarySum);

		System.out.println();
		// get the second largest salary

		Optional<Double> secondSalary = employees.stream().map(Employee::getSalary)
				.sorted((emp1, emp2) -> emp2.compareTo(emp1)).skip(1).findFirst();

		if (secondSalary.isPresent())
			System.out.println(secondSalary.get());
		

	}

}
