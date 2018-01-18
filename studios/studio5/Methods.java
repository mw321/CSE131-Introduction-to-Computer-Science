package studio5;

public class Methods {
	
	/**
	 * Implemented correctly
	 * @param x one thing to add
	 * @param y the other thing to add
	 * @return the sum
	 */
	public static int sum(int x, int y) {
		return x+y;
	}
	
	/**
	 * 
	 * @param x one factor
	 * @param y another factor
	 * @return the product of the factors
	 */
	public static int mpy(int x, int y) {
		return x * y;
	}
	
	/**
	 * 
	 * @param x first integer
	 * @param y second integer
	 * @param z third integer
	 * @return the average of the integers in double
	 */
	public static double avg3(int x, int y, int z) {
		return (x + y + z) / 3.0;
	}
	public static double sumArray(double [] array) {
		double sum = 0;
		for (double i : array) {
			sum += i;
		}
		return sum;
	}	
	public static double average(double [] array) {
		double average = Methods.sumArray(array) / array.length;
		return average;
	}
	
	public static int max(int x, int y) {
		int max = x;
		if (x < y) {
			max = y;
		}
		return max;
	}
	
	public static String pig(String s) {
		s = s.substring(1) + s.substring(0, 1) + "ay";
		return s;
	}
	
}