package technical;

public class pattern2 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			if (i == 0 || i == 4) {
				for (int j = 0; j < 5; j++) {
					System.out.print("*");
				}
				System.out.println();
			} else {
				for (int j = 0; j < 5; j++) {
					if (j == 0 || j == 3) {
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