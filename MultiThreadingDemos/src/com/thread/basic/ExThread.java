package com.thread.basic;

class Child extends Thread{
	String name;
	public Child(String name, int priority) {
		this.name = name;
		this.setName(name);
		this.setPriority(priority);
		System.out.println(this);
		this.start();
	}
 
	@Override
	public void run() {
		
		for (int i = 1; i <= 10; i++) {
//			String name = Thread.currentThread().getName();
			System.out.println(name+": "+i+" *2 = "+2*i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ExThread {

	public static void main(String[] args) {
		
		Child child1 = new Child("Child-1",10);
		Child child2 = new Child("Child-2",2);
		
		for (int i = 1; i <=10; i++) {
			String name = Thread.currentThread().getName();
			System.out.println(name+": "+i+" *5 = "+5*i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
