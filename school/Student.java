package school;

public class Student {

	private int studentId;
	private String studentName;
	private ReportCard reportCard;
	private Exam[] exams;

	public Student() {
	}

	public Student(int studentId, String studentName, ReportCard reportCard, Exam[] exams) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.reportCard = reportCard;
		this.exams = exams;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public ReportCard getReportCard() {
		return reportCard;
	}

	public void setReportCard(ReportCard reportCard) {
		this.reportCard = reportCard;
	}

	public Exam[] getExams() {
		return exams;
	}

	public void setExams(Exam[] exams) {
		this.exams = exams;
	}

	public void calculatePercentage() {
		float totalMarks = 0.0f;
		float grandTotal = 0.0f;

		for (Exam exam : exams) {
			totalMarks += exam.getMaxMarks();
			grandTotal += exam.getObtainedMarks();
		}

		reportCard.setPercentage(grandTotal / totalMarks * 100.0f);
		reportCard.calculateGrade();
	}

	public void displayStudent() {
		System.out.println("Student ID: " + getStudentId());
		System.out.println("Student Name: " + getStudentName());
		System.out.println("\n---Report Card Details---");
		getReportCard().displayGrade();
		for (Exam exam : exams) {
			exam.displayMarks();
		}
	}
}