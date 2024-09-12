package com.list.basics;

import java.util.LinkedList;

public class LinkDemo {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("Spring");
		list.add("node");
		list.add("angular");
		list.add("maven");
		System.out.println(list);
		list.addFirst("Html");
		list.addLast("Css");
		list.set(1, "react");
		list.add(0, "Java");
		list.addLast("Java");

		System.out.println(list);
		System.out.println(list.remove(3));
		System.out.println(list.remove("angular"));
		System.out.println(list.size());
		System.out.println(list.get(0));
		System.out.println(list);
		
		System.out.println(list.peek());
	      System.out.println(list);
	      System.out.println(list.peekFirst());
	      System.out.println(list);
	      System.out.println(list.peekLast());
	      System.out.println();
	      
	      System.out.println(list.poll());
	      System.out.println(list);
	      System.out.println(list.pollFirst());
	      System.out.println(list);
	      System.out.println(list.pollLast());
	      System.out.println(list);
	      System.out.println(list.poll());
	      System.out.println(list);
	      System.out.println(list.poll());
//	      System.out.println(list.remove()); // throw ex
	      System.out.println(list.peek());
	      System.out.println(list.element());// throw ex

	}

}
