package com.list.fun;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunDemo {

	public static void main(String[] args) {

		Consumer<String> con = str -> System.out.println("Great Day " + str.toUpperCase());
		con.accept("Java training");

		Supplier<Double> sup = () -> Math.random();
		System.out.println(sup.get());
		
		Supplier<String> supStr = ()-> "Hello";
		System.out.println(supStr.get());

		
		Predicate<Integer> lesserthan = i -> (i < 18);
		System.out.println(lesserthan.test(10));
		
		Predicate<String> str = sr -> sr.length() > 9;
		System.out.println(str.test("chaitu"));
		
		Function<String,Integer> fun = str1->str1.length();
		System.out.println(fun.apply("Chaitu"));

		
		
		
		

	}

}
