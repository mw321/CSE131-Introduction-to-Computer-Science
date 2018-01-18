package exercises1;

import cse131.ArgsProcessor;

public class Change {

	public static void main(String[] args) {
		//
		// Below, prompt the user to enter a number of pennies
		//
		ArgsProcessor ap = new ArgsProcessor(args);
		int pennies = ap.nextInt("How many pennies do you have?");
		
		//
		// Then, compute and print out how many 
		//    dollars, quarters, dimes, nickels, and pennies
		// should be given in exchange for those pennies, so as to
		// minimize the number of coins (see the videos)
		//
		int dollars = pennies / 100;
		int quarters = pennies % 100 / 25;
		int dimes = pennies % 25 / 10;
		int nickels = pennies % 100 % 25 % 10 / 5;
		int penniesleft = pennies % 5;
		
		System.out.println(
				"For " + pennies + " pennies:\r\n"
				+ dollars + " dollars\r\n"
				+ quarters + " quarters\r\n"
				+ dimes + " dimes\r\n"
				+ nickels + " nickels\r\n"
				+ penniesleft + " pennies");
		
		
	}

}
