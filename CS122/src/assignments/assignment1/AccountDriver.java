package assignments.assignment1;

public class AccountDriver {
	
	public static void main(String[] args) {
		Account familyAcc = new Account(123, 100.50);
		familyAcc.withdraw(40.50);
		
		Checking rainyDayFund = new Checking(123, 400, 600);
		rainyDayFund.withdraw(10000);
		
		Savings vacationFund = new Savings(123, 20);
		vacationFund.withdraw(100);
	}

}
