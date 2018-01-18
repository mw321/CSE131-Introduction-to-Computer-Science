package exercises2;

import cse131.ArgsProcessor;

public class FeetInches {

	public static void main(String[] args) {
		//
		// Prompt the user for a number of inches
		//
		ArgsProcessor ap = new ArgsProcessor(args);
		int inches = ap.nextInt("How many inches?");
		System.out.println(inches + " inches equals");
		
		// Convert that into feet and inches
		//   BUT
		// Be sure to use the singular "foot" or "inch"
		//   where appropriate, as discussed in
		//   the introductory video
		//
		// For example, 61 inches would produce
		//    the output
		//   5 feet and 1 inch
		//
		
		int feet = inches / 12;
		int inchesLeft = inches % 12;
		
		if (feet != 1) {
			System.out.println(feet + " feet and");
		}
		else {
			System.out.println(feet + " foot and");
		}
		
		if (inchesLeft != 1) {
		
			System.out.println(inchesLeft + " inches");
		}
		else {
			System.out.println(inchesLeft + " inch");
		}
		}
		}
	


