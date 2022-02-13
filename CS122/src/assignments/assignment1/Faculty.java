package assignments.assignment1;

public class Faculty extends Employee {
	public String officeHours;
	public String rank;
	
	public Faculty(String name, String address, int phoneNum, String email, String location, int pay, String hired, String hours, String ranking) {
		super(name, address, phoneNum, email, location, pay, hired);
		officeHours = hours;
		rank = ranking;

	}
	
	public String toString() {
		String result = super.toString(); 
		result += "Office hours: " + officeHours + "\nRank: " + rank + "\n";
		return result;
	}

}
