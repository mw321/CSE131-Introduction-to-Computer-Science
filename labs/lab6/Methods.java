package lab6;

public class Methods {
	
	
	//
	// In this class, implement the f and g functions described on the lab page
	//
	/**
	 * 
	 * @param x taken as integer
	 * @return return result of f(x)
	 */
	public static int recursion2(int x) {
		if (x > 100) {
			return x - 10;
		}
		else {
			return recursion2(recursion2(x + 11));
		}
	}
	/**
	 * 
	 * @param x taken as an integer
	 * @param y taken as an integer
	 * @return the result of g(x,y)
	 */
			
	public static int recursion3(int x, int y) {
		if (x == 0) {
			return y + 1;
		}
		else if (x > 0 && y == 0) {
			return recursion3(x - 1, 1);
		}
		else if (x > 0 && y > 0) {
			return recursion3(x - 1, recursion3(x, y - 1));
		}
		else{
			return 0;
		}
	}
	/**
	 * @param args
	 * main method to run the methods
	 */
	public static void main(String[] args) {
		
		//
		// from here, call f or g with the appropriate parameters
		//
		System.out.println(recursion2(99));
		System.out.println(recursion2(87));

		System.out.println(recursion3(1,0));
		System.out.println(recursion3(1,2));
		System.out.println(recursion3(2,2));


	}

}
