package ch04;

public class Exam4_06_2 {
	public static void main(String[] args) {

		int s = 6;

		for (int i = 5; i >= 1; i--) {
			for (int j = 5; j >= 1; j--) {
				if (j >= s) {
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
