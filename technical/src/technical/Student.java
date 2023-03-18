package technical;

import java.util.Scanner;

public class Student {
	private double m1;
	private double m2;
	private double m3;
	private double m4;
	private double m5;

	public void setMarks(double m1, double m2, double m3, double m4, double m5) {
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
		this.m4 = m4;
		this.m5 = m5;
	}

	public void TakeMarks() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Marks of 5 Subject ");
		m1 = sc.nextDouble();
		m2 = sc.nextDouble();
		m3 = sc.nextDouble();
		m4 = sc.nextDouble();
		m5 = sc.nextDouble();
		Student s = new Student();
		s.setMarks(m1, m2, m3, m4, m5);
	}
	Student() {

	}
	public void Grade() {
		double percentage = (m1 + m2 + m3 + m4 + m5) / 5;
		// System.out.println(percentage);
		if (percentage > 90) {
			System.out.println("Obtained Grade A");
		} else if (percentage > 80) {
			System.out.println("Obtained Grade B");
		} else if (percentage > 70) {
			System.out.println("Obtained Grade C");
		} else {
			System.out.println("Obtained Grade D");
		}
	}

	public double getM1() {
		return m1;
	}

	public void setM1(double m1) {
		this.m1 = m1;
	}

	public double getM2() {
		return m2;
	}

	public void setM2(double m2) {
		this.m2 = m2;
	}

	public double getM3() {
		return m3;
	}

	public void setM3(double m3) {
		this.m3 = m3;
	}

	public double getM4() {
		return m4;
	}

	public void setM4(double m4) {
		this.m4 = m4;
	}

	public double getM5() {
		return m5;
	}

	public void setM5(double m5) {
		this.m5 = m5;
	}
}