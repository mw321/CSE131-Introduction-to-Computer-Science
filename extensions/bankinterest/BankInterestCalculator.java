package bankinterest;

public class BankInterestCalculator {

	public static void main(String[] args) {
		System.out.println("Day		Type		Amount		Balance");
		double initialAmount = 4000;
		String type;
		double amount;
		double interest = 0;
		for (int i = 1; i <= 30; ++i) {
			if (Math.random() > 0.5) { 
				amount = 100.00; 
				initialAmount = initialAmount - amount; 
				type = "Withdraw";
			}
			else {
				amount = 200.50; 
				initialAmount = initialAmount + amount; 
				type = "Deposit";
			}
			System.out.println(i + "		" + type + "		$" + amount + "		$" + initialAmount);
			if (i == 30) {
				interest = 0.02 * initialAmount;
				interest = interest * 100;
				interest = (double) Math.round(interest) / 100;
			}
		}
		System.out.println("\t\nInterest earned: " + interest);
		double money = interest + initialAmount;
		System.out.println("Money after one month's interest: " + money);
	}
}