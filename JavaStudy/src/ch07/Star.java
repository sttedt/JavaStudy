package ch07;

public class Star {
	public static void main(String[] args) {
		int s = 2;
		int s2 = 2;
		for (int r = 0; r < 5; r++) {
			for (int c = 0; c < 5; c++) {
				if (c < s | c > s2) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}

			if (r < 2) {
				s--;
				s2++;
			} else{
				s++;
				s2--;
			}
			System.out.println();
		}
	}
}
