package lab5;

public class Lab5Methods {
	/**
	 * 
	 * @param n as an integer
	 * @return sum with data type as an integer
	 */
	public static int sumDownBy2(int n) {
		int sum = 0;
		for (int i = n; i >= 0; i -= 2) {
			sum += i;
		}
		return sum;
	}
	/**
	 * 
	 * @param n as a positive integer
	 * @return harmonic sum with data type as an integer
	 */
	public static double harmonicSum(int n) {
		double sum = 0;
		if (n > 0) {
			for (int i = 1; i <= n; i++) {
				sum += 1.0 / i;
			}
		}
		return sum;
	}
	/**
	 * 
	 * @param k as a non negative integer
	 * @return geometric sum  with data type as an integer
	 */
	public static double geometricSum(int k) {
		if (k >= 0) {
			double sum = 0;
			for (int i = 0; i <= k; i++) {
				sum += 1.0 / Math.pow(2, i);
			}
			return sum;
		}
		return 0;
	}
	/**
	 * 
	 * @param j as a positive integer
	 * @param k as a positive integer
	 * @return product of j and k as an integer
	 */
	public static int multPos(int j, int k) {
		int product = 0;
		if ((j > 0) && (k > 0)) {
			for (int i = 1; i <= k; i++) {
				product += j;
			}
		}
		return product;
	}
	/**
	 * 
	 * @param j as an integer
	 * @param k as an integer
	 * @return product of j and k as an integer
	 */
	public static int mult(int j, int k) {
		int product = multPos(Math.abs(j), Math.abs(k));
		if (j * k < 0) {
			product *= -1;
		}
		return product;
	}
	/**
	 * 
	 * @param n as an integer
	 * @param k as a non negative integer
	 * @return the value of n to the power of k as an integer
	 */
	public static int expt(int n, int k) {
		int expt = n;
		if (k > 0) {
			for (int i = 1; i < k; i++) {
				expt *= n;
			}
		}
		if ( k == 0) {
			expt = 1;
		}
		return expt;
	}
}