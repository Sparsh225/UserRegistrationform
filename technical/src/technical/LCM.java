package technical;

import java.util.Scanner;

public class LCM {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int LCM = a * b / gcd(a, b);
		System.out.println("THE LCM IS " + LCM);
		sc.close();
	}

	public static int gcd(int a, int b) {
		int min = Math.min(a, b);
		while (min > 0) {
			if (a % min == 0 && b % min == 0) {
				break;
			}
			min--;
		}
		return min;
	}
}
