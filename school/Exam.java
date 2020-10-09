package school;

public class Exam {

	private String examName;
	private double maxMarks;
	private double obtainedMarks;

	public Exam() {
	}

	public Exam(String examName, double maxMarks, double obtainedMarks) {
		this.examName = examName;
		this.maxMarks = maxMarks;
		this.obtainedMarks = obtainedMarks;
	}

	public String getExamName() {
		return examName;
	}

	public void setExamName(String examName) {
		this.examName = examName;
	}

	public double getMaxMarks() {
		return maxMarks;
	}

	public void setMaxMarks(double maxMarks) {
		this.maxMarks = maxMarks;
	}

	public double getObtainedMarks() {
		return obtainedMarks;
	}

	public void setObtainedMarks(double obtainedMarks) {
		this.obtainedMarks = obtainedMarks;
	}
	
	public void displayMarks() {
		System.out.println("Exam Name: " + getExamName());
		System.out.println("Marks Obtained: " + getObtainedMarks());
		System.out.println("Maximum Marks: " + getMaxMarks());
	}
}