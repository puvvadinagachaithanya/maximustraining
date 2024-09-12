package com.streams.basics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreateStreams {
	public static void main(String[] args) {
		List<String> courses = Arrays.asList("JAVA", "SPRING", "REACT", "HTML");

		// convert list to stream
		courses.stream().sorted().forEach(course -> System.out.println(course));
		
		//Array into stream
		Arrays.stream(new int[] {10,50,20,36,55}).sorted().forEach(num->System.out.println(num));
		
		//Array of objects
		Stream.of("Apple","Orange","Mango").forEach(fru->System.out.println(fru));
		
		//infinite stream
		Stream.generate(()->"Hello").limit(5).forEach(n->System.out.println(n));
	}
}
