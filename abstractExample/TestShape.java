package abstractExample;

import java.util.Scanner;

public class TestShape {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			
			System.out.print("Enter the number of Shapes: ");
			int shapeCount = scanner.nextInt();
			Shape[] shapes = new Shape[shapeCount];

			for (int i = 0; i < shapeCount; i++) {
				System.out.println("Choose a type of Employee");
				System.out.println("1. Circle");
				System.out.println("2. Square");
				System.out.println("3. Triangle");
				System.out.println("4. Exit");
				System.out.print("Pick an option: ");
				int optionMain = scanner.nextInt();

				switch (optionMain) {
				case 1:

					System.out.println("Enter Circle Radius: ");
					float circleRadius = scanner.nextFloat();
					
					shapes[i] = new Circle("Circle", circleRadius);
					shapes[i].findArea();
					shapes[i].printShape();

					System.out.println();
					System.out.println();

					break;

				case 2:

					System.out.println("Enter Square Side: ");
					float squareSide = scanner.nextFloat();
					
					shapes[i] = new Square("Square", squareSide);
					shapes[i].findArea();
					shapes[i].printShape();

					System.out.println();
					System.out.println();

					break;
					
				case 3:

					System.out.println("Enter Triange Height: ");
					float triHeight = scanner.nextFloat();
					
					System.out.println("Enter Triange Base: ");
					float triBase = scanner.nextFloat();
					
					shapes[i] = new Triangle("Triangle", triHeight, triBase);
					shapes[i].findArea();
					shapes[i].printShape();

					System.out.println();
					System.out.println();

					break;

				case 4:
					System.out.println("Exiting....");
					scanner.close();
					System.exit(0);

				default:
					System.err.println("INVALID INPUT!!");
					break;
				}
			}
			
		} while(true);
	}

}
