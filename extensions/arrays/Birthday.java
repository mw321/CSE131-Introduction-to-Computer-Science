package arrays;
import cse131.ArgsProcessor;
public class Birthday {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		int N = ap.nextInt("How many people are walking into the room?");

		int [][] birthday = new int [12][31];	

		for (int n = 1; n < N + 1; n ++) {
			int m = (int) (Math.random() * 12 + 1);
			int d = (int) (Math.random() * 31 + 1);
			birthday [m - 1][d - 1] += 1;
		}
		System.out.println("Fraction of people born in each month:");

		for (int i = 0; i < 12; i ++) {
			int totalMonth = 0;
			for (int j = 0; j < 31; j ++) {
				totalMonth += birthday[i][j];	
			}
			double fractionMonth = Math.round((double) totalMonth / N * 100 * 100) * 0.01;
			System.out.println("Month " + (i + 1) + ": " + fractionMonth + "%");
		}
		double averageMonth = Math.round(100 / 12.0 * 100) * 0.01;
		System.out.println("The average value is: " + averageMonth + "%");

		System.out.println("Fraction of people born on the same day:");
		for (int j = 0; j < 31; j ++) {
			int totalDay = 0;
			for (int i = 0; i < 12; i ++) {
				totalDay += birthday[i][j];
			}
			double fractionDay = Math.round((double) totalDay / N * 100 * 100) * 0.01;
			System.out.println("Day " + (j + 1) + ": " + fractionDay + "%");
		}
		double averageDay = Math.round(100 / 31.0 * 100) * 0.01;
		System.out.println("The average value is: " + averageDay + "%");

		int total = 0;
		System.out.println("Fraction of people born on the exact same day (same month and day):");
		for (int i = 0 ; i < 12; i ++) {
			for (int j = 0; j < 31; j ++) {
				if (birthday[i][j] >= 2) {
					total += birthday[i][j];
				}
			}
		}
		double average = Math.round((double) total / N * 100 * 100) * 0.01;
		System.out.println("The percentage is: " + average + "%");
	}
}