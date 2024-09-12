package com.streams.meth;

import java.util.Arrays;
import java.util.List;

public class MethodRef2 {

	public static void main(String[] args) {

		IShapeFactory shapeFactory = new Square();
		Shape sp = shapeFactory.getShpae();
		sp.area(10);

		IShapeFactory factory1 = Shape::new;
		sp = factory1.getShpae();
		sp.area(20);

		List<String> courses = Arrays.asList("JAVA", "SPRING","React");
		courses.stream().filter(cou -> cou.length() > 3).map(String::toUpperCase).forEach(System.out::println);
		
		System.out.println( courses.stream().mapToInt(String::length).sum());
	}

}
