package assignments.assignment1;

public class UniversityDriver {
	public static void main(String[] args) {

		Student aleenah = new Student ("Aleenah", "Queens", 123, "aa66247@pace.edu");
		Employee guard = new Employee ("Security guard", "Brooklyn", 123, "strongestsecurity@gmail.com", "W507", 60000, "12/3/2021");
		Faculty professor = new Faculty ("John Doe", "New Jersey", 123, "john123@yahoo.com", "W5112", 75000, "1/2/22", "MW 12-2pm", "Adjunct Professor");
		Staff janitor = new Staff ("Jamie", "Bronx", 123, "Jamiee@gmail.com", "Janitor's closet", 20000, "3/5/19", "Professional Mopper");
		
		System.out.println(aleenah.toString());
		System.out.println(guard.toString());
		System.out.println(professor.toString());
		System.out.println(janitor.toString());
	}	
}
