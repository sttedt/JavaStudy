package ch04;

import java.util.Random;

public class Bingo {
	public static void main(String[] args) {

		Random random = new Random();
		int i = random.nextInt(25);
		
		for (; i <= 25; i++) {	

			if (i < 10) {
				System.out.print("0" + i + "\t");
			} else {
				System.out.print(i + "\t");
			}
			// ÁÙ¹Ù²Þ
			if (i % 5 == 0) {
				System.out.println();
			}
		}
	}
}
