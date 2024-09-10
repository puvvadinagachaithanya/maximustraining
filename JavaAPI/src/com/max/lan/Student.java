package com.max.lan;

import java.util.Objects;

public class Student {
	private String name;
	private String city;
	private int studentId;
	public Student() {
		
	}
	public Student(String name, String city, int studentId) {
		super();
		this.name = name;
		this.city = city;
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(city, name, studentId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(city, other.city) && Objects.equals(name, other.name) && studentId == other.studentId;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", city=" + city + ", studentId=" + studentId + "]";
	}
	
	
}
