package abstractExample;

public class Triangle extends Shape {

	float height;
	float base;

	public Triangle() {
		// TODO Auto-generated constructor stub
	}

	public Triangle(String name, float height, float base) {
		super(name);
		this.base = base;
		this.height = height;
	}

	@Override
	void findArea() {
		area = 0.5f * base * height;
	}

	@Override
	public void printShape() {
		System.out.println("Height: " + height);
		System.out.println("Base: " + base);
		super.printShape();
	}

}
