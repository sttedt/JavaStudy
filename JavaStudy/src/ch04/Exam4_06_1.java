package ch04;

public class Exam4_06_1 {
	public static void main(String[] args) {

		int s = 4;

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (j <= s) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			s = s - 1;
			System.out.println();
		}
	}
}
