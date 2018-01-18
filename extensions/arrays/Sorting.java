package arrays;
import cse131.ArgsProcessor;

public class Sorting {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		int size = ap.nextInt("Size of the collection of data?");
		if (size <= 1) {
			size = ap.nextInt("Please select a size greater than 1");
		}
		System.out.println("Unsorted data:");
		int [] data = new int [size];
		for (int i = 0; i < data.length; i++) {
			int integer = ap.nextInt("Enter integer");
			data[i] = integer;
			System.out.print(data[i] + " ");
		}
		System.out.println("\nSorted data");
		int sortCount = 0; 
		int min = 0;
		int sum = 0;
		int [] sorted = new int [size];

		while(sortCount < size) {
			for (int s = 0; s < sorted.length; s++) {
				for (int i = sortCount; i + 1 < data.length; i++) {
					if (i == sortCount) {
						min = data[i];
					}
					if (min > data[i + 1]) {
						min = data[i + 1];
					}
				}
				if (sortCount == size - 1) {
					for (int i = 0; i < data.length; i++) {
						if (i == data.length - 1) {
							min = data[i];
						}
					}
				}
				System.out.print(min + " ");
				sum += min;
				sorted[s] = min;
				for (int j = sortCount; j < data.length; j++) {
					if (data[j] == min) {
						int t = data[j];
						data[j] = data[sortCount];
						data[sortCount] = t;
					}
				}
				sortCount ++;
			}
		}
		double mean = Math.round((double) sum / size * 10) * 0.1;
		System.out.println("\nMean: " + mean);
		double median = 0;
		if (size % 2 == 1) {
			median = (double) data[size / 2];
		}
		else {
			median = 0.5 * (data[size / 2] + data[size / 2 - 1]) ;
		}
		System.out.println("Median: " + median);
		int 	minimum = sorted[0];
		int	max = sorted[sorted.length - 1];
		System.out.println("Min: " + minimum);
		System.out.println("Max: " + max);
		int range = max - minimum;
		System.out.println("Range: " + range);
	}
}