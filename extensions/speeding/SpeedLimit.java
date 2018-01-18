package speeding;

import cse131.ArgsProcessor;

public class SpeedLimit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ArgsProcessor ap = new ArgsProcessor(args);
	int drivingSpeed = ap.nextInt("What was your driving speed in MPH?");
	int speedLimit = ap.nextInt("What was the speed limit in MPH?");
	System.out.println("You reported a speed of " + drivingSpeed + " MPH for a speed limit of " + speedLimit + " MPH.");
	
	int speedExceed = drivingSpeed - speedLimit;
	System.out.println("You went " + speedExceed + " MPH over the speed limit.");
	
	int fine = (speedExceed < 10) ? 50 : (50 + 10 * (speedExceed - 10) );
	fine = (speedExceed <= 0) ? 0 : fine;
	System.out.println("Your fine is $" + fine + ".");
	
	
	}

}
