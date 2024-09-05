package com.basics.student;

public class Student {
	private String name;
	private String department;

	public Student(String name, String department) {
		super();
		this.name = name;
		this.department = department;
	}

	void printDetails() {
		System.out.println("Name:" + name);
		System.out.println("Department:" + department);
	}

	String getGrades(int[] marks) {
		int sum = 0;
		int average = 0;

		for (int i : marks) {
			sum += i;
		}
		System.out.println("Sum:" + sum);
		average = sum / 2;
		System.out.println("Average:" + average);

		String grade = average > 90 ? "A" : average > 80 ? "B" : average > 60 ? "C" : average > 50 ? "D" : "fail";
		
		return grade;
	}
}
