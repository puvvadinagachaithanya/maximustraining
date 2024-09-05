package com.oops.overloading;

public class OverloadDemo {

	public static void main(String[] args) {

		Shape shape = new Shape();

		shape.area(10);

		shape.area(20.8F);
		
		shape.area("25");

		System.out.println(shape.area(15, 10.5F));

		System.out.println(shape.area(10, 20));

	}

}
