package arrays;
import cse131.ArgsProcessor;

public class PascalsTriangle {

	public static void main(String[] args) {

		ArgsProcessor ap = new ArgsProcessor(args);
		int N = ap.nextInt("How many rows should the Pascal's Triangle have?");

		int [][] triangle = new int [N + 1][N + 1];

		for (int r = 0; r < triangle.length; r++) {
			for (int c = 0; c < triangle.length; c++) {
				if ((c == 0) || (c == r)) {
					triangle [r][c] = 1;
				}
				else if ((r < 0) || (c < 0) || (c > r)) {
					triangle [r][c] = 0; //needs to fix this to space
				}
				else {
					triangle [r][c] = triangle [r - 1][c] + triangle [r-1] [c - 1];
				}
				if (triangle [r][c] != 0) {
					if (triangle [r][c] < 10) {
						System.out.print("  " + triangle[r][c] + " ");
					}
					else if (triangle [r][c] < 100) {
						System.out.print(" " + triangle[r][c] + " ");
					}
					else {
						System.out.print(triangle[r][c] + " ");
					}
				}
			}
			System.out.println();
		}
	}
}