package com.streams.basics;

import java.util.Optional;

public class OptDemo {

	public static void main(String[] args) {
		
		Optional<String> stropt = Optional.ofNullable(null);
//		Optional<String> stropt = Optional.ofNullable("Hello");
		
//		Optional<String> stropt = Optional.of("Hello");
		//Optional<String> stropt = Optional.of(null);
		
//		Optional<String> stropt = Optional.empty();
//		System.out.println(stropt.get());
		
		if(stropt.isPresent())
			System.out.println(stropt.get());
		if(stropt.isEmpty())
			System.out.println("no value available");
		
		stropt.ifPresent(str->System.out.println(str.toUpperCase()));
		stropt.ifPresentOrElse(str->System.out.println(), ()->System.out.println("no data"));
		

	}

}
