package lab0;

import cse131.ArgsProcessor;

public class PEQ1 {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		int N = ap.nextInt();
		int sum = 0;
		boolean [] array = new boolean [N];
		for (int i = 0; i < array.length; i++) {
			if (i > 2) {
				if ((i % 3 == 0)||(i % 5 == 0)) {
					array[i] = true;
				}
			}
			if (array[i]) {
				sum += i;
			}
		}
		System.out.println(sum);
	}

}
