package ch04;

import java.util.Random;
import java.util.Scanner;

public class Exam99999_3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		boolean b = true;

		while (b) {
			int i = s.nextInt();
			Random ran = new Random();
			int u = ran.nextInt(3);
			
			// double ran = Math.random() *3;
			// int u = (int) ran;

			if ((i + 1) % 3 == u) {
				System.out.println("∆–πË");
			} else {
				if (i == u) {
					System.out.println("∫Ò±Ë");
				} else {
					System.out.println("¿Ã±Ë");
					b = false;
				}
			}
		}
		s.close();
	}
}