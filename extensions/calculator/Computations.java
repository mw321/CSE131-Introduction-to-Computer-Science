package calculator;

public class Computations {

	/**
	 * Create the static methods as described on the 
	 * description for this assignment.
	 */
	
	/**
	 * add two doubles together
	 * @param d1
	 * @param d2
	 * @return
	 */
	public static double addDoubles(double d1, double d2) {
		return d1 + d2;
	}
	/**
	 * subtract two doubles
	 * @param d1
	 * @param d2
	 * @return
	 */
	public static double subtractDoubles(double d1, double d2) {
		return d1 - d2;
	}
	/**
	 * divide two doubles
	 * @param d1
	 * @param d2
	 * @return
	 */
	public static double divideDoubles(double d1, double d2) {
		if (d2 != 0) {
			return d1 / d2;
		}
		return 0;
	}
	/**
	 * multiply two doubles
	 * @param d1
	 * @param d2
	 * @return
	 */
	public static double multiplyDoubles(double d1, double d2) {
		return d1 * d2;
	}
	/**
	 * add two integer together
	 * @param i1
	 * @param i2
	 * @return
	 */
	public static int addInts(int i1, int i2) {
		return i1 + i2;
	}
	/**
	 * subtract two ints
	 * @param i1
	 * @param i2
	 * @return
	 */
	public static int subtractInts(int i1, int i2) {
		return i1 - i2;
	}
	/**
	 * divide two ints
	 * @param i1
	 * @param i2
	 * @return
	 */
	public static int divideInts(int i1, int i2) {
		if (i2 != 0) {
			return i1 / i2;
		}
		else {
			return 0;
		}
	}
	/**
	 * multiply two ints
	 * @param i1
	 * @param i2
	 * @return
	 */
	public static int multiplyInts(int i1, int i2) {
		return i1 * i2;
	}
	/**
	 * concatenate two string together
	 * @param s1
	 * @param s2
	 * @return
	 */
	public static String concatenate(String s1, String s2) {
		return s1 + s2;
	}
	/**
	 * and operation of booleans
	 * @param b1
	 * @param b2
	 * @return
	 */
	public static boolean andBoolean(boolean b1, boolean b2) {
		return b1 && b2;
	}
	/**
	 * or operation of boolenas
	 * @param b1
	 * @param b2
	 * @return
	 */
	public static boolean orBoolean(boolean b1, boolean b2) {
		return b1 || b2;
	}
	/**
	 * convert int to double
	 * @param in
	 * @return
	 */
	public static double intToDouble(int in) {
		return (double)in;
	}
	/**
	 * convert double to double
	 * @param in
	 * @return
	 */
	public static double doubleToDouble(double in) {
		return in;
	}
	/**
	 * convert string to double (unsupported operation)
	 * @param in
	 * @return
	 */
	public static double stringToDouble(String in) {
		throw new UnsupportedOperationException();
	}
	/**
	 * convert boolean to double (unsupported operation)
	 * @param in
	 * @return
	 */
	public static double booleanToDouble(boolean in) {
		throw new UnsupportedOperationException();
	}
	/**
	 * convert int to int
	 * @param in
	 * @return
	 */
	public static int intToInt(int in) {
		return in;
	}
	/**
	 * convert double to int
	 * @param in
	 * @return
	 */
	public static int doubleToInt(double in) {
		return (int) in;
	}
	/**
	 * convert string to int (unsupported operation)
	 * @param in
	 * @return
	 */
	public static int stringToInt(String in) {
		throw new UnsupportedOperationException();
	}
	/**
	 * convert boolean to int (unsupported operation)
	 * @param in
	 * @return
	 */
	public static int booleanToInt(boolean in) {
		throw new UnsupportedOperationException();
	}
	/**
	 * int to string
	 * @param in
	 * @return
	 */
	public static String intToString(int in) {
		return "" + in;
	}
	/**
	 * double to string
	 * @param in
	 * @return
	 */
	public static String doubleToString(double in) {
		return "" + in;
	}
	/**
	 * string to string
	 * @param in
	 * @return
	 */
	public static String stringToString(String in) {
		return in;
	}
	/**
	 * boolean to string
	 * @param in
	 * @return
	 */
	public static String booleanToString(boolean in) {
		return "" + in;
	}
	/**
	 * convert int boolean
	 * @param in
	 * @return
	 */
	public static boolean intToBoolean(int in) {
		throw new UnsupportedOperationException();
	}
	/**
	 * convert double to boolean
	 * @param in
	 * @return
	 */
	public static boolean doubleToBoolean(double in) {
		throw new UnsupportedOperationException();
	}
	/**
	 * convert string to boolean
	 * @param in
	 * @return
	 */
	public static boolean stringToBoolean(String in) {
		throw new UnsupportedOperationException();
	}
	/**
	 * convert boolean to boolean
	 * @param in
	 * @return
	 */
	public static boolean booleanToBoolean(boolean in) {
		return in;
	}
}
