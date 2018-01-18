package studio3;

import cse131.ArgsProcessor;

public class Sieve {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		int n = ap.nextInt("Enter an integer");

		int[] array = new int [n - 1];
		for (int i = 0; i < n - 1 ; i ++) {
			array[i] = i + 2;
		}

		for (int j = 2; j < n - 1; j ++) {

			//delete multiples of j inside this loop
			for (int i = j - 2; i + j < n - 1; i += j) {
				array[i + j] = 0;
			}
		}
		for (int i = 0; i < n - 1; i ++) {
			if (array[i] != 0) {
				System.out.print(array[i] + " ");
			}
		}
	}
}