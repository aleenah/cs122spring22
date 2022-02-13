package assignments.assignment1;

abstract public class Person {
	public String name;
	public String address;
	public int phoneNum;
	public String email;
	
	public Person(String name, String address, int phoneNum, String email) {
		this.name = name;
		this.address = address;
		this.phoneNum = phoneNum;
		this.email = email;
	}
	
	public String toString() {
		String result = "Name: " + name + "\n";
		result += "Address: " + address + "\n";
		result+= "Phone number: " + phoneNum + "\n";
		result += "Email: " + email + "\n";
		
		return result;
	}
}
