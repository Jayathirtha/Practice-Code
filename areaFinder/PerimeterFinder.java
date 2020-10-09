package areaFinder;

public class PerimeterFinder {
	
	public void perimeter(double radius) {
		System.out.println("Perimeter of Circle = " + (2 * Math.PI * radius));
		
	}
	
	public void perimeter(float side) {
		System.out.println("Perimeter of Square = " + (4 * side));
		
	}
	
	public void perimeter(double length, double width) {
		System.out.println("Perimeter of Rectangle = " + 2 * (length + width));
		
	}
}