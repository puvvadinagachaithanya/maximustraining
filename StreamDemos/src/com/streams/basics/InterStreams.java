package com.streams.basics;

import java.util.Arrays;
import java.util.List;

public class InterStreams {
	public static void main(String[] args) {
		List<String> courses = Arrays.asList("JAVA", "SPRING", "REACT", "HTML", "DOTNET","REACT","HTML");

		// filter, map, sort, distinct, concat, limit ,skip

		courses.stream().filter(cour -> cour.length() > 3).sorted().forEach(cou -> System.out.println(cou));
		
		System.out.println();
		
		courses.stream().sorted().distinct().forEach(cou->System.out.println(cou));
		
		System.out.println();
		
		courses.stream().limit(3).forEach(cou->System.out.println(cou));
		
		System.out.println();
		courses.stream().skip(3).forEach(cou->System.out.println(cou));
		
		System.out.println();
		
		
		courses.stream().filter(str->str.length() > 5)
		.map(str->str.length())
		.forEach(str->System.out.println(str));
	}
}
