package com.thread.basic;

import java.util.Iterator;

public class SleepDemo {

	public static void main(String[] args)  {
		
		Thread thread = Thread.currentThread();
		System.out.println(thread);
		for (int i = 0; i < 5; i++) {
			System.out.println(i * 2);
			try {
				thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}

}
