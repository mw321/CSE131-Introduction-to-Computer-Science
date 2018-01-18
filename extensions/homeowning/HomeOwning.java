package homeowning;

import cse131.ArgsProcessor;

public class HomeOwning {

	public static void main(String[] args) {
	ArgsProcessor ap = new ArgsProcessor(args);
	
	String name = ap.nextString("What is the name of your apartment complex?");
	String zipCode = ap.nextString("What is the zip code of your apartment?");
	System.out.println(name + " is located in the Zip code " + zipCode);
	
	int rent = ap.nextInt("The monthly rent of the apartment?");
	int rentYear = rent * 12;
	System.out.println("Rent per year: " + rentYear);
	double rentWeek = (double) rentYear / 52;
	rentWeek = rentWeek * 100;
	rentWeek = (double) Math.round(rentWeek) / 100;
	System.out.println("Rent per week: " + rentWeek);
		
	
	int interest = ap.nextInt("The daily interest payment of your mortgage on the house? (In cents)");
	double interestYear = (double) interest / 100 * 365;
	interestYear = interestYear * 100;
	interestYear = (double) Math.round(interestYear) / 100;
	System.out.println("\t\nInterest paid per year: " + interestYear);
	double interestWeek = (double) interest / 100 * 7;
	interestWeek = interestWeek * 100;
	interestWeek = (double) Math.round(interestWeek) / 100;
	System.out.println("Interest paid per week: " + interestWeek);
	
	String decision = (rentWeek < interestWeek) ? "I should rent" : "I should buy";
	System.out.println("\t\n" + decision);
	
	
	}

}
