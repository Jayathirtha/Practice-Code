package abstractExample;

public abstract class Shape {
	
	String name;
	float area;
	
	public Shape() {
	
	}
	
	public Shape(String name) {
		this.name = name;
	}
	
	abstract void findArea();
	
	public void printShape() {
		System.out.println("Name: " + name);
		System.out.println("Area: " + area);
	}

}