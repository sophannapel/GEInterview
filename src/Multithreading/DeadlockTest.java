package Multithreading;

public class DeadlockTest {

	private String s1;
	private String s2;

	public DeadlockTest(String s1, String s2) {
		this.s1 = s1;
		this.s2 = s2;
	}

	public Thread t1 = new Thread() {
		@Override
		public void run() {
			synchronized (s1) {
				synchronized (s2) {
					System.out.println("t1");
				}
			}
		}
	};

	public Thread t2 = new Thread() {
		@Override
		public void run() {
			synchronized (s2) {
				synchronized (s1) {
					System.out.println("t2");
				}
			}
		}
	};

	public static void main(String[] args) {
		DeadlockTest obj = new DeadlockTest("hello", "bye");
		obj.t2.start();
		
//		obj.t1.
		obj.t1.start();
		
		for (int i = 0; i < 100; i++) {
			obj.t1.run();
			obj.t2.run();
		}

	}
}
