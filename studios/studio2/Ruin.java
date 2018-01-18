package studio2;

import cse131.ArgsProcessor;

public class Ruin {

	public static void main(String[] args) {

		ArgsProcessor ap = new ArgsProcessor(args);
		int startAmount = ap.nextInt("How much money do you start with?");
		double winChance = ap.nextDouble("What are the chances that you will win the gamble?");
		int winAmount = ap.nextInt("What's your goal amount to win?");
		int totalPlays = ap.nextInt("Total number of times of simulation?");
		double lossChance = 1.0 - winChance;
		double Ruin;


		if (lossChance != winChance) {
			Ruin =  (Math.pow(lossChance/winChance , startAmount) - Math.pow(lossChance/winChance , winAmount)) / (1 - Math.pow(lossChance/winChance , winAmount));
		}
		else {
			Ruin = 1.0 - (double) startAmount / winAmount;
		}



		int numSimulation = 0;
		int numLoss = 0;
		while (numSimulation < totalPlays) {
			int numRounds = 0;
			int newAmount = startAmount;

			while ((newAmount > 0) && (newAmount < winAmount)) {


				if (Math.random() < winChance) {
					newAmount = newAmount + 1;
					numRounds ++;
				}
				else {
					newAmount = newAmount - 1;
					numRounds ++;
				}
			}

			if (newAmount == winAmount) {
				numSimulation ++;
				System.out.println("Simulation " + numSimulation + " : " + numRounds + " rounds 		WIN");
			}
			if (newAmount == 0) {
				numSimulation ++;
				System.out.println("Simulation " + numSimulation + " : " + numRounds + " rounds 		LOSE");
				numLoss ++;
			}
		}
		System.out.println("Losses: " + numLoss + " 	Simulations: " + totalPlays);
		System.out.println("Actual Ruin Rate: " + (double) numLoss / totalPlays + " 	Expected Ruin Rate: " + Ruin); 
	}
}
