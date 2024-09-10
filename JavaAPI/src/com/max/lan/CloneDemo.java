package com.max.lan;

public class CloneDemo {

	public static void main(String[] args) {
		Employee employee = new Employee("Chaitu", 1, 2000);
		try {
			Employee employee1 = (Employee) employee.clone();
			System.out.println(employee1);
			employee1.setEmpName("Puvvadi");
			System.out.println(employee);
			System.out.println(employee1);
			System.out.println(employee.getClass());
			System.out.println(employee1.getClass());
			System.out.println(employee.getClass().equals(employee1.getClass()));
			System.out.println(employee.equals(employee1));
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
