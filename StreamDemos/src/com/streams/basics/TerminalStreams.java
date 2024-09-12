package com.streams.basics;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class TerminalStreams {

	public static void main(String[] args) {

		List<String> courses = Arrays.asList("JAVA", "SPRING", "REACT", "HTML", "DOTNET", "REACT", "HTML");

		// foreach,iterator,collect,findfirst,findany,reduce
		List<String> filteredCourses = courses.stream().filter(cou -> cou.contains("A")).sorted()
				.collect(Collectors.toList());
		filteredCourses.forEach(cou -> System.out.println(cou));
		
		System.out.println();

		Iterator<String> iter = courses.stream().filter(cou -> cou.contains("A")).iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		

	}

}
