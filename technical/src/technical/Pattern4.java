package technical;

public class Pattern4 {
	public static void main(String[] args) {
		boolean f = true;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (f == true) {
					System.out.print(1);
					f = false;
				} else {
					System.out.print(0);
					f = true;
				}
			}
			System.out.println();
		}

	}

}
