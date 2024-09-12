package com.streams.basics;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptTerminal {

	public static void main(String[] args) {

		List<String> courses = Arrays.asList("Java", "Angular", "Node", "Javascript", "Node", "React", "Html", "css");

		Optional<String> optstr1 = courses.stream().filter(str -> str.contains("z")).findFirst();

		if (optstr1.isPresent())
			System.out.println(optstr1.get());

		String result = courses.stream().filter(str -> str.contains("N")).findFirst().orElse("zebra");
		System.out.println(result);

		result = courses.stream().filter(str -> str.contains("S")).findFirst().orElseGet(() -> {
			return "no data".toUpperCase();
		});
		System.out.println(result);

		result = courses.stream().filter(str -> str.contains("S")).findFirst()
				.orElseThrow(() -> new ArithmeticException("invalid"));
		System.out.println(result);
	}

}
