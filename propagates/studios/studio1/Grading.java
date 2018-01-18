package studio1;

import cse131.ArgsProcessor;

public class Grading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArgsProcessor ap = new ArgsProcessor(args);
String name = ap.nextString("What is your name?");
System.out.println(name);

int participation = ap.nextInt("Participation score?");
int quizzes = ap.nextInt("Quizzes score?");
int studios = ap.nextInt("Studios score?");
int labs = ap.nextInt("Labs score?");
int finalProject = ap.nextInt("Final project score?");
int extensions = ap.nextInt("Extensions score?");
int exam1 = ap.nextInt("First exam score?");
int exam2 = ap.nextInt("Second exam score?");
int exam3 = ap.nextInt("Third exam score?");

double totalScore = (double) participation * 0.03 + quizzes * 0.03 + studios * 0.07 + labs * 0.25 + finalProject * 0.07 + extensions * 0.25 + (exam1 + exam2 + exam3) * 0.1;
System.out.println("Total score: " + totalScore);

int finalScore = (int) totalScore;
System.out.println("Grade for this course: " + finalScore);

int lastDigit = finalScore % 10;

boolean plus = (lastDigit >= 7);
boolean minus = (0 <= lastDigit)  &&  (lastDigit < 3);

System.out.println("Final grade has a... ");
System.out.println("Plus: " + plus);
System.out.println("Minus: " + minus);
	}

}
