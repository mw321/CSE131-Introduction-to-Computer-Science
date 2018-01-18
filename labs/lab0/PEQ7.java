package lab0;

import cse131.ArgsProcessor;

public class PEQ7 {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		int n = ap.nextInt("Enter an integer");
		int count = 0;
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
				count++;
				//System.out.print(array[i] + " ");
			}
			if (count == 10001) {
				System.out.println(array[i]);
			}
		}
	}
}