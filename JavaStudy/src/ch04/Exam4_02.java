package ch04;

public class Exam4_02 {
	public static void main(String[] args) {
		int score = 111;
		int i = score % 2;
		int j = score % 3;

		if (i == 0 & j == 0) {
			System.out.println("ÄôÂ¦");
		} else if (i == 0) {
			System.out.println("Â¦");
		} else if (j == 0) {
			System.out.println("Äô");
		}

		/*
		 * int score = 120;
		 * 
		 * if (score % 2 == 0 & score % 3 == 0) { 
		 * 		system.out.println("ÄôÂ¦"); 
		 * } else if (score % 2 == 0) {
		 *  	system.out.println("Â¦"); 
		 * } else if (score % 3 == 0) {
		 * 		system.out.println("Äô"); 
		 * }
		 */
	}
}
