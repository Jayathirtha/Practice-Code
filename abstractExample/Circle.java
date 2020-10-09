package abstractExample;

public class Circle extends Shape {

	float radius;

	public Circle() {
		// TODO Auto-generated constructor stub
	}

	public Circle(String name, float radius) {
		super(name);
		this.radius = radius;
	}

	@Override
	void findArea() {
		area = 3.14f * radius * radius;
	}
	
	@Override
	public void printShape() {
		System.out.println("Radius: " + radius);
		super.printShape();
	}

}
