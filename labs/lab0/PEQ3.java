package lab0;

public class PEQ3 {

	public static void main(String[] args) {
		double N = 6.00851475143E11;
		int n = 1;
		int count = 0;
		for (int i = 2; i <= N; i++) {
			if (N % i == 0) {
				if (n < N) {
					n *= i;
					count++;
				}
				//System.out.print(i + " ");
			}
		}
		System.out.println(count);
	}
}