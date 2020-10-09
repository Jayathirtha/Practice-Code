package interfaces;

public class Organization implements GST {

	double turnOver;
	double profit;
	double expense;

	public Organization() {

	}

	public Organization(double turnOver, double expense) {
		super();
		this.turnOver = turnOver;
		this.expense = expense;
	}

	public Organization(double turnOver, double profit, double expense) {
		super();
		this.turnOver = turnOver;
		this.profit = profit;
		this.expense = expense;
	}

	public double getTurnOver() {
		return turnOver;
	}

	public void setTurnOver(double turnOver) {
		this.turnOver = turnOver;
	}

	public double getProfit() {
		return profit;
	}

	public void setProfit(double profit) {
		this.profit = profit;
	}

	public double getExpense() {
		return expense;
	}

	public void setExpense(double expense) {
		this.expense = expense;
	}

	@Override
	public void calcTax() {
		System.out.println("Calculated Total Tax is " + ((getProfit() * 0.09) + (getProfit() * 0.09)) + " INR");
	}

	@Override
	public void calcCGST() {
		System.out.println("Calculated CGST is " + (getProfit() * 0.09) + " INR");
		calcSGST();
	}

	@Override
	public void calcSGST() {
		System.out.println("Calculated SGST is " + (getProfit() * 0.09) + " INR");
		calcTax();
	}

	public void calculateProfit() {
		setProfit(getTurnOver() - getExpense());
		System.out.println("Total Profit is " + getProfit() + " INR");
		calcCGST();
	}
}