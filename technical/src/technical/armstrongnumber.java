package technical;
import java.util.Scanner;

public class armstrongnumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n = sc.nextInt();
		int temp = n, rev = 0;
		while (temp != 0) {
			int t = temp % 10;
			rev = rev + t * t * t;
			temp = temp / 10;
		}
		if (n == rev) {
			System.out.println("TRUE");
		} else {
			System.out.println("FALSE");
		}
		sc.close();
	}

}
