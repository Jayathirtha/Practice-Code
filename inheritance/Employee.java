package inheritance;

public class Employee {

	protected int empId;
	protected String empName;
	protected double empSalary;

	public Employee() {

	}

	public Employee(int empId, String empName, double empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}
	
	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
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

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	
	public void print() {
		System.out.println("Employee ID: " + getEmpId());
		System.out.println("Employee Name: " + getEmpName());
		System.out.println("Employee Salary: " + getEmpSalary());
	}

}