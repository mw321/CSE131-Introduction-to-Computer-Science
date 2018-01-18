package lab6;

import cse131.ArgsProcessor;

public class Beer {

	/**
	 * main method to run the program
	 * @param args
	 */
	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		int n = ap.nextInt();
		System.out.print(bottlesOfBeer(n));
	}
	/**
	 * 
	 * @param n is an integer representing the number of bottles of beer on the wall
	 * @return String which is the song
	 */
	public static String bottlesOfBeer(int n) {
		if (n > 1) {
			return n + " bottles of bear on the wall, " + n + " bottles of bear; you take one down, pass it around, " + (n-1) + " bottles of beer on the wall.\n" + bottlesOfBeer(n-1);
		}
		else {
			return n + " bottles of bear on the wall, " + n + " bottles of bear; you take one down, pass it around, " + (n-1) + " bottles of beer on the wall.\n";
		}
	}

	
}
