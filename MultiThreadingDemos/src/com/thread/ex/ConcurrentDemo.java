package com.thread.ex;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyTask implements Runnable {

	@Override
	public void run() {
		System.out.println("hello "+Thread.currentThread().getName());
	}

}

public class ConcurrentDemo {
	public static void main(String[] args) {

//		for (int i = 0; i < 10; i++) {
//			Thread t = new Thread(new MyTask(), "thread-" + i);
//			t.start();
//		}

		ExecutorService service = Executors.newFixedThreadPool(10);
		for (int i = 0; i < 50; i++) {
			service.execute(new MyTask());
		}
		service.shutdown();
	}
}
