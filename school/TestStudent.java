package school;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TestStudent {

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in);
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter the number of Students: ");
		Student[] students = new Student[scanner.nextInt()];

		for (int i = 0; i < students.length; i++) {
			System.out.print("Enter Student ID: ");
			int studentId = scanner.nextInt();

			System.out.print("Enter Student Name: ");
			String studentName = bufferedReader.readLine();

			System.out.print("Enter Exams Count: ");
			Exam[] exams = new Exam[scanner.nextInt()];

			for (int j = 0; j < exams.length; j++) {
				System.out.print("Enter Exam Name: ");
				String examName = bufferedReader.readLine();

				System.out.print("Enter Marks Obtained: ");
				double marksObtained = scanner.nextDouble();

				System.out.print("Enter Maximum Marks: ");
				double maxMarks = scanner.nextDouble();

				Exam exam = new Exam(examName, maxMarks, marksObtained);

				exams[j] = exam;
			}

			students[i] = new Student(studentId, studentName, new ReportCard(), exams);
			students[i].calculatePercentage();
		}
		
		System.out.println();

		for (Student student : students) {
			System.out.println();
			student.displayStudent();
		}

		scanner.close();
	}
}