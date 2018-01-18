package exercises3;

import cse131.ArgsProcessor;

public class TimesTable {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);

		//max value for table
		int N = ap.nextInt("Max value for table?");

		//  Table should include rows and columns for 0...N  
		//     making N+1 rows and columns
		int[][] table = new int[N + 1][N + 1];

		//for each row
		for (int r = 0; r <= N; r++) {		
			//and element in each column
			for (int c = 0; c <= N; c++) {
				table[r][c] = r * c;
			}
		}

		//make a header
		System.out.print("     ");
		for (int c = 0; c <= N; c++) {
			System.out.print(c + "  ");
		}
		System.out.println();
		for (int c = 0; c <= N + 1; c++) {
			System.out.print("---");
		}
		System.out.println();

		//print out the table
		for (int r = 0; r<= N; r++) {
			//the side
			System.out.print(r + " | ");
			for (int c = 0; c <= N; c++) {
				int entry = table[r][c];
				if (entry < 10) {
					System.out.print(" " + table[r][c] + " ");
				}
				else {
					System.out.print(table[r][c] + " ");
				}
			}
			System.out.println();
		}
	}
}