package assignments.assignment3;

public class Rectangle extends Shape {
	private double side1;
	private double side2;
	
	public Rectangle(double s1, double s2) {
		super("Rectangle");
		side1 = s1;
		side2 = s2;
	}
	
	public double area() {
		return side1*side2;
	}
	
	public String toString() {
		return super.toString() + " of width " + side1 + " and lenggth " + side2;
	}
}
