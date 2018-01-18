package exercises2;

import cse131.ArgsProcessor;

public class Heads {

	public static void main(String[] args) {

		ArgsProcessor ap = new ArgsProcessor(args);
		int times = ap.nextInt("How many times do you want to experiment to run?");
		
		int numTimes;
		int sum = 0;
		for (numTimes = 0; numTimes != times; numTimes ++) {

			// what are the concepts?
			int numHeads = 0;
			int numFlips = 0;

			// now flip a coin until we see 10 heads
			while (numHeads != 10) {
				boolean isHeads = Math.random() < 0.5;
				if (isHeads) {
					numHeads = numHeads + 1;
				}
				numFlips = numFlips + 1;

			}

			// here, numHeads should be 10


			//System.out.println( (numTimes + 1) + " times of the run: Number of flips was " + numFlips);
			sum = sum + numFlips;
		}
			double average = (double) sum / (double) times; 
			System.out.println("In " + times + " times of the experiment, the average number of flips is " + average);
			
	}

}
