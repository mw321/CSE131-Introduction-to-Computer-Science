package studio3;

import cse131.ArgsProcessor;

public class Sieve2 {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		int n = ap.nextInt("Enter an integer");
		boolean[] array = new boolean [n + 1];//the contents of the array are defaulted as false
		for (int i = 0; i < array.length; i++) {
			if ((i == 0) || (i == 1)) {
				array[i] = true; //true stands for not prime
			}
			for (int j = 2 + i; j + i + 2 < array.length; j += i + 2) {
				array[j + i + 2] = true;
			}
		}
		for (int i = 0; i < array.length; i++) {
			if (array[i] == false) {
			System.out.print(i + " ");
			}
		}
	}
}