package technical;
public class pattern3 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			if (i == 1 || i == 5) {
				for (int j = 0; j < 7; j++) {
					System.out.print("*");
				}
				System.out.println();
			} else {
				for (int j = 0; j < 7; j++) {
					if (j == 0 || j == 6) {
						System.out.print("*");
					} else if (i == 3 && j == 3) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}
	}
}
