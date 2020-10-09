package inheritance;

public class ConsultantEmployee extends Employee {

	int numDays;
	double chargesPerDay;
	double incentives;

	public ConsultantEmployee() {

	}

	public ConsultantEmployee(int empId, String empName, int numDays, double chargesPerDay, double incentives) {
		super(empId, empName);
		this.numDays = numDays;
		this.chargesPerDay = chargesPerDay;
		this.incentives = incentives;
	}

	public int getNumDays() {
		return numDays;
	}

	public void setNumDays(int numDays) {
		this.numDays = numDays;
	}

	public double getChargesPerDay() {
		return chargesPerDay;
	}

	public void setChargesPerDay(double chargesPerDay) {
		this.chargesPerDay = chargesPerDay;
	}

	public double getIncentives() {
		return incentives;
	}

	public void setIncentives(double incentives) {
		this.incentives = incentives;
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	
	public void print() {
		calculateSalary();
		super.print();
		System.out.println("Consultant Number of Days: " + getNumDays());
		System.out.println("Consultant Charges Per Day: " + getChargesPerDay());
		System.out.println("Consultant Incentives: " + getIncentives());
	}

	public void calculateSalary() {
		super.setEmpSalary((getNumDays() * getChargesPerDay()) + getIncentives());
	}
}