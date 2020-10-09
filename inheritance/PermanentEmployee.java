package inheritance;

public class PermanentEmployee extends Employee {

	double baseSalary;
	double hra;
	double da;
	double bonus;

	public PermanentEmployee() {

	}

	public PermanentEmployee(int empId, String empName, double empSalary, double baseSalary, double hra, double da,
			double bonus) {
		super(empId, empName, empSalary);
		this.baseSalary = baseSalary;
		this.hra = hra;
		this.da = da;
		this.bonus = bonus;
	}

	public PermanentEmployee(int empId, String empName, double baseSalary, double bonus) {
		super(empId, empName);
		this.baseSalary = baseSalary;
		this.bonus = bonus;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public double getHra() {
		return hra;
	}

	public void setHra(double hra) {
		this.hra = hra;
	}

	public double getDa() {
		return da;
	}

	public void setDa(double da) {
		this.da = da;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	@Override
	public boolean equals(Object obj) {
		return (obj instanceof PermanentEmployee && this.baseSalary == ((PermanentEmployee) obj).baseSalary
				&& this.hra == ((PermanentEmployee) obj).hra && this.da == ((PermanentEmployee) obj).da
				&& this.bonus == ((PermanentEmployee) obj).bonus) ? true : false;
	}

	public void print() {

		calculateSalary();
		super.print();
		System.out.println("Employee Base Salary: " + getBaseSalary());
		System.out.println("Employee HRA: " + getHra());
		System.out.println("Employee DA: " + getDa());
		System.out.println("Employee Bonus: " + getBonus());
	}

	private double calculateHRA(double basicSalary) {
		return (15f / 100) * basicSalary;
	}

	private double calculateDA(double basicSalary) {
		return (20f / 100) * basicSalary;
	}

	private double calculateBonus(double basicSalary) {
		return (getBonus() / 100) * basicSalary;
	}

	public void calculateSalary() {

		setHra(calculateHRA(getBaseSalary()));
		setDa(calculateDA(getBaseSalary()));
		setBonus(calculateBonus(getBaseSalary()));
		super.setEmpSalary(getBaseSalary() + getHra() + getDa() + getBonus());
	}
}