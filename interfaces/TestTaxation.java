package interfaces;

import java.util.Scanner;

public class TestTaxation {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		do {

			System.out.println("Please a User Type");
			System.out.println("1. Organization");
			System.out.println("2. Employee");
			System.out.println("3. Exit");
			System.out.print("Choose an Option: ");

			switch (scanner.nextInt()) {
			case 1:
				System.out.print("My Total Turnover is ");
				double turnOver = scanner.nextDouble();

				System.out.print("My Total Expenses are ");
				double expense = scanner.nextDouble();

				Organization organization = new Organization(turnOver, expense);
				organization.calculateProfit();
				
				System.out.println();
				System.out.println();

				break;

			case 2:
				System.out.print("My Total Income is ");
				double income = scanner.nextDouble();

				System.out.print("My Total Interest are ");
				double interest = scanner.nextDouble();

				Employee employee = new Employee(income, interest);
				employee.calcIncome();
				
				System.out.println();
				System.out.println();

				break;

			case 3:
				System.out.println("Exiting...");
				scanner.close();
				System.exit(0);

			default:
				System.err.println("INVALID INPUT!!");
				System.out.println();
				break;
			}

		} while (true);

	}

}
