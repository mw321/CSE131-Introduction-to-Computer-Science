package exercises6;

public class Cse240 {


	public static int function (int[]array, int index, int mode, int[]farray) {
		if (index < array.length) {
			if (farray[index] > farray[mode]) {
				return function(array, index+1, index, farray);
			}
			else {
				return function(array, index+1, mode, farray);
			}
		}
		else {
			return mode;
		}
	}

	public static void main(String []args) {
		int[] array = {1,1,1,1,2,2,3,3,3,3,3,4};
		int[] farray = new int [100];
		for (int i = 0; i < array.length; i++) {
			farray[array[i]]++;
		}
		System.out.println(function(array,0,array[0],farray));
	}
}
