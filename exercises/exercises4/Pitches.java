package exercises4;

import cse131.ArgsProcessor;

public class Pitches {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		//int pitch = ap.nextInt("Enter an integer representing a pitch");
		// encoding has 0 as concert A
		//    1 would be Bb, just above A
		//   -1 would be Ab, just below A
//			double frequency = Math.round(440 * Math.pow(2, pitch / 12.0) * 100) * 0.01;
//			System.out.println("frequency is " + frequency);
//			double frequency7 = Math.round(frequency * Math.pow(2, 7 / 12.0) * 100) * 0.01;	
//			System.out.println("frequency of the pitch that is 7 chromatic steps higher is " + frequency7);
//			double ratio = Math.round(frequency7 / frequency * 100) * 0.01;
//			System.out.println("the ratio between them is " + ratio);
//			
		int pitch1 = ap.nextInt("Enter an integer representing pitch 1");
		int pitch2 = ap.nextInt("Enter an integer representing pitch 2");
		double frequency1 = Math.round(440 * Math.pow(2, pitch1 / 12.0) * 100) * 0.01;
		System.out.println("frequency for pitch 1 is " + frequency1);
		double frequency2 = Math.round(440 * Math.pow(2, pitch2 / 12.0) * 100) * 0.01;
		System.out.println("frequency for pitch 2 is " + frequency2);
		double ratio = Math.round(frequency2 / frequency1 * 100) * 0.01;
		System.out.println("the ratio between them is " + ratio);
	}
}