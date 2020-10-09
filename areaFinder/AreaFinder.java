package areaFinder;

public class AreaFinder {
	
	public void area(double radius) {
		System.out.println("Area of Circle = " + (Math.PI * radius * radius));
		
	}
	
	public void area(float side) {
		System.out.println("Area of Square = " + (side * side));
		
	}
	
	public void area(double length, double width) {
		System.out.println("Area of Rectangle = " + (length * width));
		
	}
}