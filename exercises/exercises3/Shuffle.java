package exercises3;

public class Shuffle {

	public static void main(String[] args) {

		// original deck of cards
		String[] original = { "A", "B", "C", "D",
				"E", "F", "G", "H"
		};

		// print out original array
		for (int i=0; i < original.length; ++i) {
			System.out.println("Original at " + i + " is " + original[i]);
		}

		//new deck called shuffled
		String[] shuffled = new String[original.length];

		// fill shuffled from the bottom
		for (int i = shuffled.length - 1; i != -1; --i) {

			//index
			int index = (int) ((i + 1) * Math.random());

			//put chosen card in shuffled
			shuffled[i] = original[index];

			//close up the gap
			for (int j = 0; j < shuffled.length - 1; ++j) {
				if (j < index) {
					original[j] = original[j];
				}
				else {
					original[j] = original[j + 1];
				}
			}
		}

		//print result
		System.out.println("\t");
		for (int i = 0; i < shuffled.length; ++i) {
			System.out.println("Shuffled at " + i + " is " + shuffled[i]);
		}
	}
}