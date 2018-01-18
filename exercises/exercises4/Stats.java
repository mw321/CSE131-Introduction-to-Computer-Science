package exercises4;

import sedgewick.StdIn;
import cse131.ArgsProcessor;

public class Stats {

	public static void main(String[] args) {
		// prompt the user for the file to be used for this run
		ArgsProcessor.useStdInput("datafiles/average");

		//
		//  Read in the data from the opened file, computing the
		//     sum, average, count, max, and min
		//  of the data
		//
		//  count is the number of doubles read from the file
		//  The other statistics should be clear from their names
		//
		double sum = 0;
		int num = 0;
		double max = Double.MIN_VALUE;
		double min = Double.MAX_VALUE;
		
		while (! StdIn.isEmpty()) {
			double d = StdIn.readDouble();
			System.out.println(d);
			if (d > max) {
				max = d;
			}
			if (d < min) {
				min = d;
			}
			sum += d;
			num ++;
		}
		System.out.println("sum is " + sum);
		double average = sum / num;
		System.out.println("average is " + average);
		System.out.println("count is " + num);
		System.out.println("max is " + max);
		System.out.println("min is " + min);

		
		
		
	}

}
