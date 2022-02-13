package assignments.assignment1;

public class Staff extends Employee {
	public String title;
	
	public Staff(String name, String address, int phoneNum, String email, String location, int pay, String hired, String jobName) {
		super(name, address, phoneNum, email, location, pay, hired);
		title = jobName;
	}
	
	public String toString() {
		String result = super.toString(); 
		result += "Title: " + title + "\n";
		return result;
	}
}
