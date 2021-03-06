package classSamples.polymorphism.Firm;//********************************************************************
//  Hourly.java       Author: Lewis/Loftus
//
//  Represents an employee that gets paid by the hour.
//********************************************************************

public class Hourly extends Employee {
	protected int hoursWorked;

	// -----------------------------------------------------------------
	// Constructor: Sets up this hourly employee using the specified
	// information.
	// -----------------------------------------------------------------
	public Hourly(String eName, String eAddress, String ePhone, String socSecNumber, double rate) {
		super(eName, eAddress, ePhone, socSecNumber, rate);

		hoursWorked = 0;
	}

	// -----------------------------------------------------------------
	// Adds the specified number of hours to this employee's
	// accumulated hours.
	// -----------------------------------------------------------------
	public void addHours(int moreHours) {
		hoursWorked += moreHours;
	}

	// -----------------------------------------------------------------
	// Computes and returns the pay for this hourly employee.
	// -----------------------------------------------------------------
	public double pay() {
		double payment = payRate * hoursWorked;
		return payment;
	}
	
	public double Vacation() {
		double vacationDays;
		if (pay() > 500) {
			vacationDays = 10;
		} else {
			vacationDays = 0;
		}
		
		return vacationDays;
	}

	// -----------------------------------------------------------------
	// Returns information about this hourly employee as a string.
	// -----------------------------------------------------------------
	public String toString() {
		String result = super.toString();

		result += "\nCurrent hours: " + hoursWorked + "\nVacation Days: " + this.Vacation();

		return result;
	}
}
