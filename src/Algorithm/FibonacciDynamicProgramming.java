package Algorithm;

import java.util.HashMap;

public class FibonacciDynamicProgramming {

	public static void main(String[] args) {
		FibonacciDynamicProgramming obj = new FibonacciDynamicProgramming();
		System.out.println(obj.fib(new HashMap<Integer, Integer>(), 40));
	}

	public int fib(HashMap<Integer, Integer> result, int n) {
		if (n < 0)
			return -1;
		else {
			if (n < 2)
				return 1;
			else {
				result.put(n-1, fib(result, n-1));
				result.put(n-2, fib(result, n-2));
				return result.get(n-1) + result.get(n-2);
			}
		}
	}
}
