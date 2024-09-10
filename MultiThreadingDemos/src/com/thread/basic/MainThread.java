package com.thread.basic;

public class MainThread {

	public static void main(String[] args)  {
		
		Thread thread = Thread.currentThread();
		thread.setName("Main Thread");
		thread.setPriority(Thread.MIN_PRIORITY+1);
		System.out.println(thread.getName());
		System.out.println(thread.getPriority());
		System.out.println(thread);
		int num[] = null;
		System.out.println(num[2]);
		

	}

}
