package studio2;

import cse131.ArgsProcessor;

public class Pi {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		int N = ap.nextInt("How many times is the dart thrown?");
		int circle = 0;
		for (int i = 0; i < N; i++) {
			double x = Math.random();
			double y = Math.random();
			if ((Math.pow(x, 2) + Math.pow(y, 2)) <= 1.0) {
				circle++;
			}
		}
		double pi = (double) circle / N * 4;
		System.out.println(pi);
	}

}
