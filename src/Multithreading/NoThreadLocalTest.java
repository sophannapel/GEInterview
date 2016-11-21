package Multithreading;

import java.io.IOException;
import java.util.Random;

public class NoThreadLocalTest implements Runnable {

	private String data = "default";

	@Override
	public void run() {
		System.out.println("Thread name = " + Thread.currentThread().getName()
				+ " default value = " + data);
		try {
			Thread.sleep(new Random().nextInt(1000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		data = "new";
		System.out.println("Thread name = " + Thread.currentThread().getName()
				+ " value = " + data);
	}

	public static void main(String[] args) {
		NoThreadLocalTest obj = new NoThreadLocalTest();
		for (int i = 0; i < 5; i++) {
			Thread t = new Thread(obj, "" + i);
			try {
				Thread.sleep(new Random().nextInt(1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			t.start();
		}
	}
}
