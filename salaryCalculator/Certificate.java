package salaryCalculator;

public class Certificate {

	private String certificateName;
	private String issuerName;
	private String grade;

	public Certificate() {
	}

	public Certificate(String certificateName, String issuerName, String grade) {
		super();
		this.certificateName = certificateName;
		this.issuerName = issuerName;
		this.grade = grade;
	}

	public String getCertificateName() {
		return certificateName;
	}

	public void setCertificateName(String certificateName) {
		this.certificateName = certificateName;
	}

	public String getIssuerName() {
		return issuerName;
	}

	public void setIssuerName(String issuerName) {
		this.issuerName = issuerName;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	public void displayCertificate() {
		System.out.println("\n---Certificate Details---");
		System.out.println("Certificate Name: " + getCertificateName());
		System.out.println("Certificate Issuer Name: " + getIssuerName());
		System.out.println("Grade: " + getGrade());
	}
}