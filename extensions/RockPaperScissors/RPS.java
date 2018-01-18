package RockPaperScissors;

import cse131.ArgsProcessor;

public class RPS {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);

		//ask how many rounds does player want to play
		int rounds = ap.nextInt("How many rounds do you want to play?");
		System.out.println("You are playing " + rounds + " rounds");

		int rpsComputer;
		int winPlayer = 0;
		int winComputer = 0;
		int tie = 0;

		for (int i = 0; i < rounds; ++i) {
			String moveComputer = null;
			String movePlayer = null;
			String winner = null;

			//player chooses rps
			int rpsPlayer = ap.nextInt("Rock, paper, or scissors? '1' for Rock, '2' for Paper, and '3' for Scissors");
			if ((rpsPlayer != 1) && (rpsPlayer !=2) && (rpsPlayer !=3)) {
				rpsPlayer = ap.nextInt("You can only input 1, 2, or 3. '1' for Rock, '2' for Paper, and '3' for Scissors");
			}
			if (rpsPlayer == 1){
				movePlayer = "Rock";
			}
			if (rpsPlayer == 2) {
				movePlayer = "Paper";
			}
			if (rpsPlayer == 3)
			{
				movePlayer = "Scissors";
			}
			//computer chooses rps
			if (Math.random() < 1.0 / 3.0) {
				rpsComputer = 1;
				moveComputer = "Rock";
			}
			else if (Math.random() > 2.0 / 3.0) {
				rpsComputer = 2;
				moveComputer = "Paper";
			}
			else {
				rpsComputer = 3;
				moveComputer = "Scissors";
			}
			//decides who wins
			if (((rpsPlayer - rpsComputer) == -1) || ((rpsPlayer - rpsComputer) == 2)) {
				winner = "Computer";
				winComputer ++;
			}
			else if (((rpsPlayer - rpsComputer) == -2) || ((rpsPlayer - rpsComputer) == 1)) {
				winner = "Player";
				winPlayer ++;
			}
			else {
				winner = "no one";
				tie ++;
			}
			System.out.println("Round " + (i+1) + "		Player chooses " + movePlayer + ", Computer chooses " + moveComputer + ", and " + winner + " wins");
		}
		//fraction of wins
		double fractionPlayer = Math.round((double) winPlayer * 100 / (rounds - tie) * 10) / 10.0;
		double fractionComputer = Math.round((double) winComputer * 100 / (rounds - tie) * 10) / 10.0;
		System.out.println("Player wins " + fractionPlayer + "% of the time and Computer wins " + fractionComputer + "% of the time.");
	}
}
