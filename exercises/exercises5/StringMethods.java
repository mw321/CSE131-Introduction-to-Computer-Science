package exercises5;

public class StringMethods {
	//
	// Below are the methods defined for this exercise
	//   The names are not prescribed in the assignment, so choose
	//   names you like (that are meaningful)
	//

	//
	// First one is completed for you:
	//
	public static String selfConcat(String s) {
		return multipleConcat(s, 2);
	}
	public static String multipleConcat(String s, int n) {
		String [] array = new String [n];
		for (int i = 0; i < array.length; i++) {
			array[i] = s;
		}
		return join(array, " ");
	}
	public static String join(String[] array, String joiner) {
		String t = "";
		for (int i = 0; i < array.length; i++) {
			t = t + array[i] + joiner;
		}
		return t;
	}
	public static void main(String[] args) {
		//
		// Testing the methods
		//
		System.out.println(selfConcat("echo"));
	}
}