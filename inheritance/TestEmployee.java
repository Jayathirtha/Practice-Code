package inheritance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TestEmployee {

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in);
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		do {

			System.out.print("Enter the number of Employees: ");
			int employeeCount = scanner.nextInt();
			Employee[] employees = new Employee[employeeCount];

			for (int i = 0; i < employeeCount; i++) {
				System.out.println("Choose a type of Employee");
				System.out.println("1. Permanent Employee");
				System.out.println("2. Consultant Employee");
				System.out.println("3. Exit");
				System.out.print("Pick an option: ");
				int optionMain = scanner.nextInt();

				switch (optionMain) {
				case 1:

					System.out.print("Enter Employee ID: ");
					int empId = scanner.nextInt();

					System.out.print("Enter Employee Name: ");
					String empName = reader.readLine();

					System.out.print("Enter Basic Salary: ");
					double basicSalary = scanner.nextDouble();

					System.out.print("Enter Bonus Percentage: ");
					double bonus = scanner.nextDouble();

					employees[i] = new PermanentEmployee(empId, empName, basicSalary, bonus);
//					if (employees[i].equals(obj))
					employees[i].print();

					System.out.println();
					System.out.println();

					break;

				case 2:

					System.out.print("Enter Employee ID: ");
					int conEmpId = scanner.nextInt();

					System.out.print("Enter Employee Name: ");
					String conEmpName = reader.readLine();

					System.out.print("Enter Number of Days: ");
					int conNumDays = scanner.nextInt();

					System.out.print("Enter Charges Per Day: ");
					double conChargesPerDay = scanner.nextDouble();

					System.out.print("Enter Incentive: ");
					double conIncentivePer = scanner.nextDouble();

					employees[i] = new ConsultantEmployee(conEmpId, conEmpName, conNumDays, conChargesPerDay,
							conIncentivePer);
					employees[i].print();

					System.out.println();
					System.out.println();

					break;

				case 3:
					System.out.println("Exiting....");
					scanner.close();
					reader.close();
					System.exit(0);

				default:
					System.err.println("INVALID INPUT!!");
					break;
				}
			}
		} while (true);
	}
}