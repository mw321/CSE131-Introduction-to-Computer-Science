package lab1;

import cse131.ArgsProcessor;

public class Nutrition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArgsProcessor ap = new ArgsProcessor(args);
		String name = ap.nextString("What is the name of the food?");
		System.out.println(name + " has");
		
		double carbs = ap.nextDouble("How many grams of carbohydrates are in your food?");
		double carbsCal = carbs * 4;
		System.out.println("\t" + carbs + " grams of carbohydrates = " + carbsCal + " Calories");
		
		double fat = ap.nextDouble("How many grams of fat are in your food?");
		double fatCal = fat * 9;
		fatCal = fatCal * 10;
		fatCal = (double) Math.round(fatCal) / 10;
		System.out.println("\t" + fat + " grams of fat = " + fatCal + " Calories");
		
		
		double protein = ap.nextDouble("How many grams of protein are in your food?");
		double proteinCal = protein * 4;
		System.out.println("\t" + protein + " grams of protein = " + proteinCal + " Calories");
		
		int statedCals = ap.nextInt("What is the number of calories stated on your food's label?");
		System.out.println("\r\nThis food is said to have " + statedCals + " (available) Calories.");
		
		double unavailable = (double) carbsCal + fatCal + proteinCal - statedCals;
		double fiber = unavailable / 4;
		unavailable = unavailable * 10;
		unavailable = (double) Math.round(unavailable) / 10;
		fiber = fiber * 100;
		fiber = (double) Math.round(fiber) / 100;
		System.out.println("With " + unavailable + " unavailable Calories, this food has " + fiber + " grams of fiber.");
		
		System.out.println("\t\nApproximately");
		
		double percentCarbs = (carbsCal - unavailable) / statedCals * 100;
		percentCarbs = percentCarbs * 10;
		percentCarbs = (double) Math.round(percentCarbs) / 10;
		System.out.println("\t" + percentCarbs + "% of your food is carbohydrates");
		
		double percentFat = fatCal / statedCals * 100;
		percentFat = percentFat * 10;
		percentFat = (double) Math.round(percentFat) / 10;
		System.out.println("\t" + percentFat + "% of your food is fat");
				
		double percentProtein = proteinCal / statedCals * 100;
		percentProtein = percentProtein * 10;
		percentProtein = (double) Math.round(percentProtein) / 10;
		System.out.println("\t" + percentProtein + "% of your food is protein");
		
		boolean lowcarbDiet = (percentCarbs <= 25);
		System.out.println("\t\nThis food is acceptable for a low-carb diet? " + lowcarbDiet);
		
		boolean lowfatDiet = (percentFat <= 15);
		System.out.println("This food is acceptable for a low-fat diet? " + lowfatDiet);
		
		double random = Math.random();
		boolean heads = (random > 0.5);
		System.out.println("By coin flip, you should eat this food? " + heads);
	
		
	}

}
