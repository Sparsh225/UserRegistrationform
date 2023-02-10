package technical;

import java.util.Scanner;

public class primeno_in_range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range between which you have to find prime number ");
		int start = sc.nextInt();
		int end = sc.nextInt();
		for (int i = start; i <= end; i++) {
			boolean flag = true;
			for (int j = 2; j <= i; j++) {
				if (i % j == 0 && i != j || i % 2 == 0) {
					flag = false;
				}
			}
			if (flag) {
				System.out.println(i);
			}
		}
		sc.close();
	}

}
