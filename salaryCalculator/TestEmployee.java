package salaryCalculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TestEmployee {

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in);
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter the number of Employees: ");
		int empCount = scanner.nextInt();

		Employee[] employees = new Employee[empCount];
		Certificate[] certificates;
//		Address[] addresses = new Address[empCount];

		for (int i = 0; i < employees.length; i++) {

			System.out.print("Please enter Employee ID: ");
			int empId = scanner.nextInt();

			System.out.print("Please enter Employee Name: ");
			String empName = bufferedReader.readLine();

			System.out.print("Please enter Basic Salary of Employee: ");
			double empBasicSalary = scanner.nextDouble();

			System.out.print("Please enter Address of Employee: ");
			String empAddress = bufferedReader.readLine();

			System.out.print("Please enter City of Employee: ");
			String empCity = bufferedReader.readLine();

			System.out.print("Please enter State of Employee: ");
			String empState = bufferedReader.readLine();

			System.out.print("Please enter Postal Code of Employee: ");
			int empPostalCode = scanner.nextInt();

			System.out.print("Enter Certificate Count: ");
			int certificateCount = scanner.nextInt();

			certificates = new Certificate[certificateCount];

			for (int j = 0; j < certificateCount; j++) {

				System.out.print("Enter Certificate Name: ");
				String certificateName = bufferedReader.readLine();

				System.out.print("Enter Issuer Name: ");
				String issuerName = bufferedReader.readLine();

				System.out.print("Enter Grade on Certificate: ");
				String certificateGrade = bufferedReader.readLine();

				certificates[j] = new Certificate(certificateName, issuerName, certificateGrade);
			}

			employees[i] = new Employee(empId, empName, empBasicSalary,
					new Address(empAddress, empCity, empState, empPostalCode), certificates);

			System.out.println();
		}

		System.out.println();
		System.out.println("Based on the input, below are the calculations");

		for (Employee employee : employees) {
			employee.displayAll();
		}
		scanner.close();

	}
}