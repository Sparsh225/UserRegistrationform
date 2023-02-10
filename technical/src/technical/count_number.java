package technical;

import java.util.Scanner;

public class count_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a Number ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count = 0;
		while (num != 0) {
			num = num / 10;
			count++;
		}
		System.out.print("Number of digits are " + count);
		sc.close();
	}

}
