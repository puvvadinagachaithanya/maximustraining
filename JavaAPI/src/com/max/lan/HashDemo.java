package com.max.lan;

public class HashDemo {

	public static void main(String[] args) {
		Student student1 = new Student("Rakesh","Ooty", 10);
		Student student2 = new Student("Rakesh","Ooty", 10);
		Student student3 = new Student("Rakesh","Ooty", 12);
		Student student4 = new Student("Rakesh","Goa", 10);
		
		System.out.println("student1 "+student1.hashCode());
		System.out.println("student2 "+student2.hashCode());
		System.out.println("student3 "+student3.hashCode());
		System.out.println("student4 "+student4.hashCode());
	
		System.out.println("s1 and s2 "+student1.equals(student2));
		System.out.println("s1 and s3 "+student1.equals(student3));
		System.out.println("s1 and s4 "+student1.equals(student4));
		System.out.println("s3 and s4 "+student3.equals(student4));
		
		String s1= "hello";
		String s2= "hello";
		String s3= new String("hello");
		String s4= new String("hello");
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(s3 == s4);     //compare hashcode
		System.out.println(s3.equals(s4)); // compare literal values
		System.out.println(s1.equals(s3));
         
		
	}

}
