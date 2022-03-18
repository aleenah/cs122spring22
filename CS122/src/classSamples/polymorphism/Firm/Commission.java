package classSamples.polymorphism.Firm;

public class Commission extends Hourly {
	protected double sales;
	protected double commRate;
	
	public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double commRate) {
		super(eName, eAddress, ePhone, socSecNumber, rate);
		commRate = this.commRate;
		sales = 0;
	}
	
	public void addSales (double totalSales) {
		sales += totalSales; 
	}
	
	public double pay() {
		double payment = super.pay() + (sales * commRate);
		return payment;
	}
	
	public String toString() {
		String result = super.toString();

		result += "\nTotal Sales: " + sales;

		return result;
	}

}
