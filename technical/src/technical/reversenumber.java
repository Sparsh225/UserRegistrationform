package technical;

import java.util.Scanner;

public class reversenumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n = sc.nextInt();
		int rev = 0;
		while (n != 0) {
			int t = n % 10;
			rev = rev * 10 + t;
			n = n / 10;
		}
		System.out.println("The reverse number is ");
		System.out.println(rev);
		sc.close();

	}

}
