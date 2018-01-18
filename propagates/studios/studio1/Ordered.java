package studio1;

import cse131.ArgsProcessor;

public class Ordered {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		int x = ap.nextInt("What is the value for x?");
		int y = ap.nextInt("What is the value for y?");
		int z = ap.nextInt("What is the value for z?");
		boolean isOrdered = (x < y) && (y < z) || (x > y) && (y > z);
		System.out.println(isOrdered);
	}

}
