package com.oops.abs;

public class AbstractMain {

	public static void main(String[] args) {
		
		Shape shape = new Rectangle();
		
		shape.area(10, 20);
		shape.show();
		
		shape = new Triangle();
		shape.area(200, 300);
		shape.show();
		
		Triangle triangle = (Triangle)shape;
		triangle.printTypes();

	}

}
