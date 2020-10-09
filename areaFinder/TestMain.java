package areaFinder;

import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		AreaFinder areaFinder = new AreaFinder();
		PerimeterFinder perimeterFinder = new PerimeterFinder();
		VolumeFinder volumeFinder = new VolumeFinder();

		do {

			System.out.println("Please choose an operation: ");
			System.out.println("1. Area");
			System.out.println("2. Perimeter");
			System.out.println("3. Volume");
			System.out.println("4. Exit");
			System.out.print("Choose an option: ");

			int operation = scanner.nextInt();

			switch (operation) {
			case 1:
				System.out.println("Choose a shape: ");
				System.out.println("1. Circle");
				System.out.println("2. Square");
				System.out.println("3. Rectangle");
				System.out.println("4. Exit");

				System.out.print("Choose an option: ");

				int areaShape = scanner.nextInt();

				switch (areaShape) {
				case 1:
					System.out.print("Enter the radius of Circle: ");
					double areaCircleRadius = scanner.nextDouble();
					areaFinder.area(areaCircleRadius);
					break;

				case 2:
					System.out.print("Enter the side length of Square: ");
					float areaSquareSide = scanner.nextFloat();
					areaFinder.area(areaSquareSide);
					break;

				case 3:
					System.out.print("Enter the length of Rectangle: ");
					double areaRectLen = scanner.nextDouble();
					System.out.print("Enter the width of Rectangle: ");
					double areaRectWid = scanner.nextDouble();
					areaFinder.area(areaRectLen, areaRectWid);
					break;

				case 4:
					System.out.println("Exiting...");
					break;

				default:
					System.err.println("INVAILD INPUT!!");
					break;
				}
				
				System.out.println();
				System.out.println();
				
				break;

			case 2:

				System.out.println("Choose a shape: ");
				System.out.println("1. Circle");
				System.out.println("2. Square");
				System.out.println("3. Rectangle");
				System.out.println("4. Exit");

				System.out.print("Choose an option: ");

				int periShape = scanner.nextInt();

				switch (periShape) {
				case 1:
					System.out.print("Enter the radius of Circle: ");
					double periCircleRadius = scanner.nextDouble();
					perimeterFinder.perimeter(periCircleRadius);
					break;

				case 2:
					System.out.print("Enter the side length of Square: ");
					float periSquareSide = scanner.nextFloat();
					perimeterFinder.perimeter(periSquareSide);
					break;

				case 3:
					System.out.print("Enter the length of Rectangle: ");
					double periRectLen = scanner.nextDouble();
					System.out.print("Enter the width of Rectangle: ");
					double periRectWid = scanner.nextDouble();
					perimeterFinder.perimeter(periRectLen, periRectWid);
					break;

				case 4:
					System.out.println("Exiting...");
					break;

				default:
					System.err.println("INVAILD INPUT!!");
					break;
				}
				
				System.out.println();
				System.out.println();
				
				break;

			case 3:

				System.out.println("Choose a shape: ");
				System.out.println("1. Sphere");
				System.out.println("2. Cube");
				System.out.println("3. Cylinder");
				System.out.println("4. Exit");

				System.out.print("Choose an option: ");

				int volShape = scanner.nextInt();

				switch (volShape) {
				case 1:
					System.out.print("Enter the radius of Sphere: ");
					double volSphereRadius = scanner.nextDouble();
					volumeFinder.volume(volSphereRadius);
					break;

				case 2:
					System.out.print("Enter the side length of Cube: ");
					float VolCubeSide = scanner.nextFloat();
					volumeFinder.volume(VolCubeSide);
					break;

				case 3:
					System.out.print("Enter the height of Cylinder: ");
					double volCylHei = scanner.nextDouble();
					System.out.print("Enter the radius of Cylinder: ");
					double volCylRad = scanner.nextDouble();
					volumeFinder.volume(volCylHei, volCylRad);
					break;

				case 4:
					System.out.println("Exiting...");
					break;

				default:
					System.err.println("INVAILD INPUT!!");
					break;
				}
				
				System.out.println();
				System.out.println();

				break;

			case 4:
				System.out.println("Exiting System...");
				break;

			default:
				System.err.println("INVAILD INPUT!!");
			}
			
//			scanner.close();
//			System.exit(0);

		} while (true);
	}
}