package fibonacci;

public class Fibonacci {

	/**
	 * Below copy your solution to recursive Fibonacci from studio
	 * @param n
	 * @return fib(n), computed recursively
	 */
	public static int recursive(int n) {
		if (n > 1) {
			return recursive(n - 1) + recursive(n - 2);
		}
		else {
			return n;
		}
	}
	/**
	 * Below write your solution to Fibonacci, using iteration
	 * @param n
	 * @return fib(n), computed iteratively
	 */
	public static int iterative(int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		int a = 0; 
		int b = 1;
		int result = 0;
		for (int i = 2; i <= n; i++) {
			result = a + b;
			a = b;
			b = result;
		}
		return result;
	}

}
