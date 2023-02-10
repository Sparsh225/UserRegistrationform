package technical;

import java.util.Scanner;

public class leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a Year ");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println("Leap year");
		} else {
			System.out.println("Not a Leap year");
		}
		sc.close();
	}

}
