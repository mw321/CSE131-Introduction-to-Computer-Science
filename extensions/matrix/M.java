package matrix;

public class M {
	public static void main(String[] args) {
		double[][] m = new double[2][2];
		m[0][0] = 1;
		m[0][1] = 2;
		m[1][0] = 3;
		m[1][1] = 4;
		double[][]n = new double[2][2];
		int a = 0, b = 0;
		for (double[] i : m) {
			b = 0;
			for (double j : i) {
				n[a][b] = j;
				b++;
			}
			a++;
		}
		for (double[] i : n) {
			for (double j : i)
			System.out.print(j + " ");

		}
	}
}
