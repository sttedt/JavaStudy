package ch04;

import java.util.Scanner;

public class Exam99999_2 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("���� : 0 , ���� : 1 , �� : 2");
		int i = scan.nextInt();
		// ���� ��� 1
		double ran = Math.random() * 3;
		// ������� 2
//		Random random = new Random();
//		int ran2 = random.nextInt(3);

		int u = (int) ran;

		if (0 < i & i < 3) {
			System.out.println(u);
			if ((i + 1) % 3 == u) {
				System.out.println("�й�");
			} else if (i == u) {
				System.out.println("���");
			} else {
				System.out.println("�̱�");
			}

		} else {
			System.out.println("0~2 ���ڸ� �־��ּ���");

		}scan.close();
	}
}