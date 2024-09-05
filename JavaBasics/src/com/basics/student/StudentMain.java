package com.basics.student;

public class StudentMain {

	public static void main(String[] args) {

		Student student = new Student("Chaitu", "Computer");
		student.printDetails();
		String grade = student.getGrades(new int[] { 80, 85, 80 });
		System.out.println("Grade is:" + grade);
		System.out.println("\n");
		
		Student studentElectronics = new Student("Ramesh", "Electronics");
		studentElectronics.printDetails();
		String electronicGrade = studentElectronics.getGrades(new int[] { 55, 45, 40 });
		System.out.println("Grade is:" + electronicGrade);
		System.out.println("\n");
		
		Student studentThree = new Student("Suresh", "IT");
		studentThree.printDetails();
		String gradeThree = studentThree.getGrades(new int[] { 10, 20, 15 });
		System.out.println("Grade is:" + gradeThree);
	}

}
