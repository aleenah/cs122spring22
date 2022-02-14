package assignments.assignment1;

public class Account {
	private int id;
	private double annualInterestRate;
	private double balance;
	

	public Account() {
		setId(0); 
		setAnnualInterestRate(0);
		setBalance(0);
	}
	
	public Account(int ID, double bal) {
		setId(ID);
		setBalance(bal);
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public double getMonthlyIntRate() {
		return annualInterestRate/12;
	}
	
	public void deposit(double addedMoney) {
		balance += addedMoney;
	}
	
	public void withdraw(double withdrawnMoney) {
		if (balance - withdrawnMoney < 0) {
			System.out.println("Balance not sufficient.");
		} else {
			System.out.println("$" + withdrawnMoney + " Withdrawn.");
			balance -= withdrawnMoney;
		}
	}
	
}



