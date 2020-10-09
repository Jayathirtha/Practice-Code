package salaryCalculator;

public class Employee {

	private int empId;
	private String empName;
	private double basicSalary;
	private Address address;
	private Certificate[] certificates;

	public Employee() {
	}

	public Employee(int empId, String empName, double basicSalary, Address address, Certificate[] certificates) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.basicSalary = basicSalary;
		this.address = address;
		this.certificates = certificates;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Certificate[] getCertificates() {
		return certificates;
	}

	public void setCertificates(Certificate[] certificates) {
		this.certificates = certificates;
	}

	private double calculateHRA(double basicSalary) {
		return (15f / 100) * basicSalary;
	}

	private double calculateDA(double basicSalary) {
		return (20f / 100) * basicSalary;
	}

	public void displayAll() {
		System.out.println("ID: " + getEmpId());
		System.out.println("Name: " + getEmpName());
		System.out.println("Basic Salary: " + getBasicSalary());
		System.out.println("HRA: " + calculateHRA(getBasicSalary()));
		System.out.println("DA: " + calculateDA(getBasicSalary()));
		System.out.println(
				"Total Salary: " + (getBasicSalary() + calculateHRA(getBasicSalary()) + calculateDA(getBasicSalary())));
		getAddress().displayAddress();
		for (Certificate certificate: getCertificates()) {
			certificate.displayCertificate();
		}
		System.out.println("\n");
	}
}
