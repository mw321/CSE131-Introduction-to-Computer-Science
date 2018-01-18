package lab0;

public class PEQ9 {

	public static void main(String[] args) {
		for (int a = 0; a < 1000; a++) {
			for (int b = 0; b < 1000; b++) {
				for (int c = 0; c < 1000; c++) {
					if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) {
						if (a + b + c == 1000) {
							System.out.println(a * b * c);
						}
					}
				}
			}
		}	
	}
}
