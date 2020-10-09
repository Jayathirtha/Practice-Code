package prime;

import java.util.Scanner;

public class TestPrimeFinder {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		PrimeFinder primeFinder = new PrimeFinder();
		
		System.out.print("Please enter a number to check prime for: ");
		int input = scanner.nextInt();
		
		primeFinder.findPrime(input);
		
		scanner.close();

	}
}