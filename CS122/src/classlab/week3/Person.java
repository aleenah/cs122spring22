package classlab.week3;

public abstract class Person {
	public String name;
	protected int age; 
	protected String city;
	
	public Person (String name, int age, String city) { 
		this.name = name;
		this.age = age;
		this.city = city;
	}
	
	public int getAge() {
		return age;
	}
	
	public abstract void printName();
	protected abstract void printAge ();
	
	protected static void printObjValues() {
		System.out.println("object");
	}

	
}
