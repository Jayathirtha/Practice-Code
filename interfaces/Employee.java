package interfaces;

public class Employee implements IncomeTax {

	double income;
	double interest;

	public Employee() {

	}

	public Employee(double income, double interest) {
		super();
		this.income = income;
		this.interest = interest;
	}

	public double getIncome() {
		return income;
	}

	public void setIncome(double income) {
		this.income = income;
	}

	public double getInterest() {
		return interest;
	}

	public void setInterest(double interest) {
		this.interest = interest;
	}

	@Override
	public void calcTax() {
		System.out.println("Calculated Total Tax is " + ((getInterest() * 0.1) + (getIncome() * 0.1)) + " INR");
	}

	@Override
	public void calcIncome() {
		System.out.println("Calculated Tax on Income is " + (getIncome() * 0.1) + " INR");
		calcOtherSources();
	}

	@Override
	public void calcOtherSources() {
		System.out.println("Calculated Tax on Other Sources is " + (getInterest() * 0.1) + " INR");
		calcTax();
	}
}