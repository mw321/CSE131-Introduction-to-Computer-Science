package lab3;

import cse131.ArgsProcessor;

public class Dice {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);

		//prompt the user for the two inputs
		int numDice = ap.nextInt("How many dice do you want to use?");
		int numTimes = ap.nextInt("How many times will the dice be thrown?");

		//construct an array for values of dice
		int [] dice = new int [numDice];

		//array to store the sum
		int [] sum = new int [numDice * 6 + 1];

		//how often do all the dice show the same value?
		int [] sameValue = new int [7];

		//sum of the dice
		int sumDice = 0;

		int same = 0;

		//loop through number of times the user prompted
		for (int times = 0; times < numTimes; times++) {

			//clear up sum after every throw
			sumDice = 0;

			for (int i = 0; i < sameValue.length; i ++) {
				sameValue[i] = 0;
			}

			//for every die
			for (int i = 0; i < dice.length; i++) {

				//value on dice includes 1 to 6
				int value = (int) (Math.random() * 6) + 1;

				//assign the value on dice
				dice[i] = value;

				sameValue[value] = sameValue[value] + 1;

				//print value on dice
				System.out.print(dice[i] + " ");

				//sum up the values
				sumDice = sumDice + value;
			}

			System.out.println();

			//sum
			System.out.println("Sum is " + sumDice);

			for (int i = 0; i < sameValue.length; i++) {
				if(sameValue[i] == numDice) {
					same += 1;
					System.out.println("The dice show same values!");
				}
			}

			//number of times the sum occurs
			sum [sumDice] = sum [sumDice] + 1;
		}
		System.out.println();

		double samePercentage = Math.round((double) same / numTimes * 100 * 10) * 0.1;
		System.out.println("How often all the the dice show the same value: " + samePercentage + " %");

		//check through every element in the array sum
		for (int i = 0; i < sum.length; i++) {
			//print the number of times the sum occurs and its percentage of occurrence
			if (sum[i] > 0) {
				double sumPercentage = Math.round((double) sum[i] / numTimes * 100 * 10) * 0.1;
				System.out.println("The sum " + i + " occurs " + sum[i] + " times, which takes " + sumPercentage + " % percent of total number of throws.");	
			}
		}
	}
}

//For D dice, which sums occur most frequently? 
//observation: for D dice, the sums with values around 3D occurs most frequently.


