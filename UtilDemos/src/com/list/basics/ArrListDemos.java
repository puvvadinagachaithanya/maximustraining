package com.list.basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrListDemos {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Ram");
		list.add("Chaitu");
		list.add("Naresh");
		list.add("Jaswik");
		list.add("Karthik");
		list.add(1, "john");
		list.set(4, "Sujala");

		for (String str : list) {
			System.out.println(str);
		}

		Collections.sort(list);
		System.out.println("");

		Iterator<String> it = list.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next().toUpperCase());
		}

		System.out.println("");
		ListIterator<String> listIterator = list.listIterator(list.size());
		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous().toUpperCase());
		}
	}

}
