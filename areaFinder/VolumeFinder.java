package areaFinder;

public class VolumeFinder {
	
	public void volume(double radius) {
		System.out.println("Volume of Sphere = " + ((4.0d/3) * Math.PI * radius * radius * radius));
		
	}
	
	public void volume(float side) {
		System.out.println("Volume of Cube = " + (side * side * side));
		
	}
	
	public void volume(double height, double radius) {
		System.out.println("Volume of Cylinder = " + (3.14 * radius * radius * height));
		
	}
}