package technical;

import java.util.Scanner;

public class EmployeeCaller {

	public static void main(String[] args) {

		MessageResourceBundle mr = new MessageResourceBundle();
		// System.out.println("Employee Salary Slip....");
		System.out.println(mr.getValue("welcome_message"));
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Employee Id : ");
		int empid = scanner.nextInt(); // \n

		scanner.nextLine();

		System.out.println("Enter Employee Name : ");
		String empname = scanner.nextLine();

		System.out.println("Enter Employee Basic Salary : ");
		double salary = scanner.nextDouble();

		scanner.nextLine();

		System.out.println("Enter Employee Emailid : ");
		String email = scanner.nextLine();

		EmpolyeeDetails ram = new EmpolyeeDetails(empid, empname, salary, email);
		// it will show hash/(address of object) by defaut if we dont create toString()
		// method
		System.out.println(ram);

//		System.out.println("Name is : " + ram.showEmploye());
		// System.out.println(ram.showEmploye());
//		System.out.println("Email is : " + ram.getEmail());
//	    System.out.println("Basic Salary is : " + ram.getSalary());
		// System.out.println("Payable Salary is : " + ram.CalcSalary());

		scanner.close();
	}
}
