package school;

public class ReportCard {

	private String grade;
	private double percentage;

	public ReportCard() {
	}

	public ReportCard(String grade, double percentage) {
		this.grade = grade;
		this.percentage = percentage;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public void calculateGrade() {
		if (getPercentage() < 40)
			grade = "Fails";
		else if (getPercentage() >= 40 && getPercentage() < 60)
			grade = "2nd Class";
		else if (getPercentage() >= 60 && getPercentage() < 75)
			grade = "1st Class";
		else if (getPercentage() >= 75 && getPercentage() < 100)
			grade = "Distinction Class";
		else
			grade = "Invalid Grade";
	}

	public void displayGrade() {
		System.out.println("Grade: " + getGrade());
		System.out.println("Precentage: " + getPercentage());
	}
}