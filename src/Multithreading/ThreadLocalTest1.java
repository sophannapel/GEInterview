package Multithreading;

import java.util.Random;

public class ThreadLocalTest1 implements Runnable {

	private ThreadLocal<String> value = new ThreadLocal<String>() {
		@Override 
		public String initialValue() {
			return "default";
		}
	};

	@Override
	public void run() {
		System.out.println("Thread name = " + Thread.currentThread().getName()
				+ " default value = " + value.get());
		try {
			Thread.sleep(new Random().nextInt(1000));
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		value.set("new");
		
		System.out.println("Thread name = " + Thread.currentThread().getName()
				+ " value = " + value.get());
	}
	
	public static void main(String[] args) throws InterruptedException {
		ThreadLocalTest1 obj = new ThreadLocalTest1();
		for(int i=0; i<5; i++) {
			Thread t = new Thread(obj, ""+i);
			Thread.sleep(new Random().nextInt(1000));
			t.start();
		}
	}
}
