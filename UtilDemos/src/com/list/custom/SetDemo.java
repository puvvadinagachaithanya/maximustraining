package com.list.custom;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {

		 //Set<String> set = new HashSet<String>();
		// Set<String> set = new LinkedHashSet<>();
		Set<String> set = new TreeSet<String>();   // Does not allow null
		set.add("Java");
		set.add("Node");
		set.add("Angular");
		set.add("Mockito");
		set.add("React");
		set.add("100");
		set.add("maven");
		set.add("Java"); // duplicate
		//set.add(null);
		System.out.println(set);

		for (String str : set) {
			System.out.println(str);
		}
	}

}
