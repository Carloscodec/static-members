package util;

public class Calculator {

	public double PI = 3.14;
	
	public double circumference(double radius) {
		return 2 * PI * radius;
	}
	
	public double volume(double radius) {
		return 4.0 * PI * Math.pow(radius, 3);
	}
}
