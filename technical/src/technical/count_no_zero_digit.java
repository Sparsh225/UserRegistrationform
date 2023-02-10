package technical;

public class count_no_zero_digit {


	static int has0(int x) {
		while (x != 0) {
			if (x % 10 == 0) {
				return 1;
			}
			x /= 10;
		}

		return 0;
	}

	static int getCount(int n) {
		int count = 0;
		for (int i = 1; i <= n; i++) {
			count += has0(i);
		}

		return count;
	}

	public static void main(String args[]) {
		int n = 107;
		System.out.println("Count of numbers from 1" + " to " + n + " is " + getCount(n));
	}
}

