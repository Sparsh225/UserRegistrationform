package technical;

public class EmpolyeeDetails {
	private int id;
	private String name;
	private double salary;
	private String email;
	private String company;
	private double hra;
	private double da;
	private double ta;
	private double ma;
	private double pf;
	private double tds;

	public EmpolyeeDetails() {
		this.company = "Brain mentors";
		this.hra = 0.30;
		this.da = 0.10;
		this.ta = 0.12;
		this.ma = 0.40;
		this.pf = 0.05;
		this.tds = 0.15;
	}

	public EmpolyeeDetails(int id, String name, double salary, String email) {
		this(); // call default constructor
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getHRA() {
		return this.salary * this.hra;
	}

	public double getTA() {
		return this.salary * this.ta;
	}

	public double getDA() {
		return this.salary * this.da;
	}

	public double getMA() {
		return this.salary * this.ma;
	}

	// deduction
	public double getTDS() {
		return this.salary * this.tds;
	}

	public double getPF() {
		return this.salary * this.pf;
	}

	public double CalcSalary() {
		double earnings = this.salary + getHRA() + getTA() + getDA() + getMA();
		double deduction = -getTDS() + getPF();
		double payablesalary = earnings - deduction;
		return payablesalary;
	}

	/*
	 * public String showEmploye() { CommonUtils utils = new CommonUtils("en",
	 * "IN"); this.name = utils.getProperName(name); String date =
	 * utils.FormatDate(); String formatsalary = utils.FormatSalary(CalcSalary());
	 * return date + "\n" + this.name + "\n" + formatsalary; }
	 */

	@Override
	public String toString() {
		CommonUtils utils = new CommonUtils("en", "IN");
		this.name = utils.getProperName(name);
		String date = utils.FormatDate();
		String formatsalary = utils.FormatSalary(CalcSalary());
		return "Date : " + date + "\n" + "Name : " + this.name + "\n" + "Salary : " + formatsalary;
	}
}
