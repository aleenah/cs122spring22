package assignments.assignment2;

public class Driver {
	public static void main(String[] args) {
		Speaker smith = new Teacher();
		smith.name();
		
		Speaker mom = new Parent();
		mom.speak();
		
		Speaker jack = new MotivationalSpeaker();
		jack.name();
	}
}
