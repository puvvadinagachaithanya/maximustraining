package com.oops.bean;

public class Student {
    private String studentName;
    private int id;
    private boolean isGraduate;
	public boolean isGraduate() {
		return isGraduate;
	}
	public void setGraduate(boolean isGraduate) {
		this.isGraduate = isGraduate;
	}
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
    
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", id=" + id + ", isGraduate=" + isGraduate + "]";
	}
    
}
