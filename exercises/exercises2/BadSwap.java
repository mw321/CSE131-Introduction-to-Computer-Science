package exercises2;

import cse131.ArgsProcessor;

public class BadSwap {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		
		int x = ap.nextInt("Enter x");
		int y = ap.nextInt("Enter y");
		
		if (x > y) {
			x = y;     // Bad
			y = x;     // swap!!
		}
		
		System.out.println("x and y are now"
				+ x + " and " + y);
		
		//
		// Student fill in with comments below this line:
		//   Why does the code above *not* swap the values of
		//      x and y?
		//   Note that the bad swap executes only if x>y
		//
		// Your answer:
		//	
		//	When x is greater than y the boolean x > y is true 
		//  and the codes inside the if statement are executed one after another in sequence. 
		//	In the first line x = y; the input y value is assigned to x.
		//	However, in the second line y = x; 
		//	the x value, which equals to the input y value, is assigned to y again
		//	this means that the y value does not change but x value is also equal to input y value
		//	as a result x and y now have the same value instead of having each other's input value

	}

}
