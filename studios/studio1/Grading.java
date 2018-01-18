package studio1;

import cse131.ArgsProcessor;

public class Grading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArgsProcessor ap = new ArgsProcessor(args);
		String name = ap.nextString("What is you name?");
		int participation = ap.nextInt("How many participation points do you have?");
		int quiz = ap.nextInt("What is your avergae quiz score?");
		int studio = ap.nextInt("How many studio points do you have?");
		int lab = ap.nextInt("How many lab points do you have?");
		int finalproject = ap.nextInt("What is your score on your final project?");
		int extension = ap.nextInt("How many extension points do you have?");
		int examone = ap.nextInt("What is your score on exam one?");
		int examtwo = ap.nextInt("What is your score on exam two?");
		int examthree = ap.nextInt("What is your score on exam three?");
		double weightedaverage = (double) participation * 0.03 + quiz * 0.03 + studio * 0.07 + lab * 0.25 + finalproject * 0.07 + extension * 0.25 + (examone + examtwo + examthree) * 0.03;
		System.out.println(name + ":");
		System.out.println(		"Total score: " + weightedaverage);
		int totalscore = (int) weightedaverage; 
		System.out.println(		"Grade for this course: " + totalscore);
		int lastdigit = totalscore % 10;
		boolean plus = lastdigit > 7;
		boolean minus = (lastdigit > 0) && (lastdigit < 3);
		System.out.println("Final grade has a...");
		System.out.println("Plus: " + plus);
		System.out.println("Minus: " + minus);
		
		
	}

}
