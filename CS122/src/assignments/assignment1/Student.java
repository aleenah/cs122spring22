package assignments.assignment1;

public class Student extends Person {
	public static final String status = "Freshman";
	public Student(String name, String address, int phoneNum, String email) {
		super(name, address, phoneNum, email);
	}
	
	public String toString() {
		String result = super.toString(); 
		result += "Status: " + status + "\n";
		return result;
	}
}
