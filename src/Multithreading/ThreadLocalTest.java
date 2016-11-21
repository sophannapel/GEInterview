package Multithreading;

import java.text.SimpleDateFormat;
import java.util.Random;

public class ThreadLocalTest implements Runnable {

	private static final ThreadLocal<SimpleDateFormat> formatter = new ThreadLocal<SimpleDateFormat>() {
		@Override
		protected SimpleDateFormat initialValue() {
			return new SimpleDateFormat("yyyyMMdd HHmm");
		}
	};

	@Override
	public void run() {
		System.out.println("Thread name = " + Thread.currentThread().getName()
				+ " default Formatter = " + formatter.get().toPattern());
		try {
			Thread.sleep(new Random().nextInt(1000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		formatter.set(new SimpleDateFormat());
		System.out.println("Thread name = " + Thread.currentThread().getName()
				+ " fomatter = " + formatter.get().toPattern());
	}

	public static void main(String[] args) throws InterruptedException {
		ThreadLocalTest obj = new ThreadLocalTest();
		for (int i = 0; i < 10; i++) {
			Thread t = new Thread(obj, "" + i);

			Thread.sleep(new Random().nextInt(1000));
			t.start();
		}
	}
}
