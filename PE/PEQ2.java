package lab0;

import cse131.ArgsProcessor;

public class PEQ2 {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		int N = ap.nextInt();
		int sum = 0;
		int array [] = new int [N];
		for (int i = 1; i < array.length; i++) {
			array[i] = i;
		}
		for (int i = 1; i + 2 < array.length; i++) {
			array[i + 2] = array[i] + array[i + 1];
			System.out.print(array[i] + " ");
			if (array[i] < 4000000) {
				if (i > 1) {
					if ((array[i] % 2 == 0)) {
						sum += array[i];
					}
				}
			}
		}
		System.out.println("\n" + sum);
	}
}