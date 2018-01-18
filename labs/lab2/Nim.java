package lab2;

import cse131.ArgsProcessor;

public class Nim {

	public static String whoWins(int x, int y) {
		String s;
		if (x % 2 == y) {
			s = "Human wins";
		}
		else {
			s = "Computer wins";
		}
		return s;
	}

	public static void main(String[] args) {

		ArgsProcessor ap = new ArgsProcessor(args);

		//ask if the player want to go first
		int starts = ap.nextInt("Do you want make the first move or the second move? (type 1 or 2)");

		//ask how many sticks should the pile have
		int initialSticks = ap.nextInt("How many sticks does the pile have? (must be greater than 5)");

		int round = 0;  //keep track of number of rounds

		String name;
		int remove = 0;
		int sticksRemain = initialSticks;
		int sticksAtstart = initialSticks;

		//player goes first
		if (starts == 1) { 
			System.out.println("Player starts");

			while (sticksRemain > 0) {		//keep track of sticks left

				if (round % 2 == 0) { //determine whose round it is: the player's round
					name = "human";
					if (sticksRemain == 1) {  //if there is only one left, the player can remove only one
						remove = ap.nextInt("How many sticks do you want to remove? (There is only one stick left)");
					}
					else { 					//ask how many sticks to remove
						remove = ap.nextInt("How many sticks do you want to remove? (You can only remove 1 or 2)");
					}

					//only 1 or 2 is acceptable
					if ((remove == 1) || (remove == 2)) {
						sticksRemain = sticksRemain - remove;

						// human made his/her move
						System.out.println("Round " + (round + 1) + ", " + sticksAtstart + " sticks at start, " + name + " took " + remove + ", so " + sticksRemain + " sticks remain");

						sticksAtstart = sticksAtstart - remove;
						round ++;  //keep track of the number of rounds
					}
					else {
						while ((remove != 1) && (remove != 2)) {
							remove = ap.nextInt("How many sticks do you want to remove? (You can only remove 1 or 2)");
							if ((remove == 1) || (remove == 2)) {
								sticksRemain = sticksRemain - remove;

								// human made his/her move
								System.out.println("Round " + (round + 1) + ", " + sticksAtstart + " sticks at start, " + name + " took " + remove + ", so " + sticksRemain + " sticks remain");

								sticksAtstart = sticksAtstart - remove;
								round ++; 	//keep track of the number of rounds
							}
						}
					}		
				}
				//computer's turn
				if (round % 2 == 1) {
					name = "computer";
					if (sticksRemain == 1) { //only can remove one when there is only one left
						remove = 1;
						sticksRemain = sticksRemain - remove;
						System.out.println("Round " + (round + 1) + ", " + sticksAtstart + " sticks at start, " + name + " took " + remove + ", so " + sticksRemain + " sticks remain");
						sticksAtstart = sticksAtstart - remove;
						round ++;
					}

					else if (sticksRemain > 0) {
						if (Math.random() > 0.5) {		//computer's turn to remove sticks randomly
							remove = 1;
						}
						else {
							remove = 2;
						}
						sticksRemain = sticksRemain - remove;
						System.out.println("Round " + (round + 1) + ", " + sticksAtstart + " sticks at start, " + name + " took " + remove + ", so " + sticksRemain + " sticks remain");
						sticksAtstart = sticksAtstart - remove;
						round ++;
					}
				}
			}			
			// finds out who wins
			System.out.println(whoWins(round, 1));
		}
		//if computer goes first
		if (starts == 2) {
			System.out.println("Computer starts");

			while (sticksRemain > 0) {		//keep track of sticks left

				if (round % 2 == 1) { //determine whose round it is: the player's round
					name = "human";
					if (sticksRemain == 1) {  //if there is only one left, the player can remove only one
						remove = ap.nextInt("How many sticks do you want to remove? (There is only one stick left)");
					}
					else { 					//ask how many sticks to remove
						remove = ap.nextInt("How many sticks do you want to remove? (You can only remove 1 or 2)");
					}

					//only 1 or 2 is acceptable
					if ((remove == 1) || (remove == 2)) {
						sticksRemain = sticksRemain - remove;

						// human made his/her move
						System.out.println("Round " + (round + 1) + ", " + sticksAtstart + " sticks at start, " + name + " took " + remove + ", so " + sticksRemain + " sticks remain");

						sticksAtstart = sticksAtstart - remove;
						round ++;  //keep track of the number of rounds
					}
					else {
						while ((remove != 1) && (remove != 2)) {
							remove = ap.nextInt("How many sticks do you want to remove? (You can only remove 1 or 2)");
							if ((remove == 1) || (remove == 2)) {
								sticksRemain = sticksRemain - remove;

								// human made his/her move
								System.out.println("Round " + (round + 1) + ", " + sticksAtstart + " sticks at start, " + name + " took " + remove + ", so " + sticksRemain + " sticks remain");

								sticksAtstart = sticksAtstart - remove;
								round ++; 	//keep track of the number of rounds
							}
						}
					}			
				}
				//computer's turn
				if (round % 2 == 0) {
					name = "computer";
					if (sticksRemain == 1) { //only can remove one when there is only one left
						remove = 1;
						sticksRemain = sticksRemain - remove;
						System.out.println("Round " + (round + 1) + ", " + sticksAtstart + " sticks at start, " + name + " took " + remove + ", so " + sticksRemain + " sticks remain");
						sticksAtstart = sticksAtstart - remove;
						round ++;
					}

					else if (sticksRemain > 0) {
						if (Math.random() > 0.5) {		//computer's turn to remove sticks randomly
							remove = 1;
						}
						else {
							remove = 2;
						}
						sticksRemain = sticksRemain - remove;
						System.out.println("Round " + (round + 1) + ", " + sticksAtstart + " sticks at start, " + name + " took " + remove + ", so " + sticksRemain + " sticks remain");
						sticksAtstart = sticksAtstart - remove;
						round ++;
					}
				}			
				// finds out who wins
				System.out.println(whoWins(round, 0));
			}
		}
	}
}
