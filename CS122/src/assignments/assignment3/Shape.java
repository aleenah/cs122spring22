package assignments.assignment3;

abstract public class Shape {
	public String shapeName;
	
	public Shape(String name) {
		shapeName = name;
	}

	public double area() {
		return 0;
	}

	public String toString() {
		return shapeName;
	}
}
