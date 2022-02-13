package assignments.assignment1;

public class Employee extends Person {
	public String office;
	public int salary; 
	public String dateHired;
	
	public Employee(String name, String address, int phoneNum, String email, String location, int pay, String hired) {
		super(name, address, phoneNum, email);
		office = location; 
		salary = pay;
		dateHired = hired;
	}
	
	public String toString() {
		String result = super.toString();
		result += "Office: " + office + "\nSalary: " + salary + "\nDate hired: " + dateHired + "\n";
		return result;
	}
}
