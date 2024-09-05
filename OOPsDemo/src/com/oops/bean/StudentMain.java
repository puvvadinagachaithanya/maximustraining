package com.oops.bean;

public class StudentMain {

	public static void main(String[] args) {
		Student student = new Student();
		student.setStudentName("Chaitu");
		student.setId(1);
		student.setGraduate(true);
		
		System.out.println(student.getStudentName());
		System.out.println(student.getId());
		System.out.println(student.toString());

	}

}
