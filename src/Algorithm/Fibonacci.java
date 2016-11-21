package Algorithm;

public class Fibonacci {

	public int fib(int n) {
		if (n < 0)
			return -1;
		else {
			if (n == 0)
				return 0;
			if (n < 2)
				return 1;
			else
				return fib(n - 1) + fib(n - 2);
		}
	}
	
	public static void main(String[] args) {
		Fibonacci obj = new Fibonacci();
		System.out.println(obj.fib(40));
	}
}
