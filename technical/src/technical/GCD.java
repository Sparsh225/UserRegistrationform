package technical;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int min = Math.min(a, b);
		while (min > 0) {
			if (a % min == 0 && b % min == 0) {
				break;
			}
			min--;
		}
		System.out.println("THE GCD OF " + a + " AND " + b + " is " + min);
		sc.close();
	}

}
