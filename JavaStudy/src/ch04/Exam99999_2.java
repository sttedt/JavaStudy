package ch04;

import java.util.Scanner;

public class Exam99999_2 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("가위 : 0 , 바위 : 1 , 보 : 2");
		int i = scan.nextInt();
		// 랜덤 방식 1
		double ran = Math.random() * 3;
		// 랜덤방식 2
//		Random random = new Random();
//		int ran2 = random.nextInt(3);

		int u = (int) ran;

		if (0 < i & i < 3) {
			System.out.println(u);
			if ((i + 1) % 3 == u) {
				System.out.println("패배");
			} else if (i == u) {
				System.out.println("비김");
			} else {
				System.out.println("이김");
			}

		} else {
			System.out.println("0~2 숫자를 넣어주세요");

		}scan.close();
	}
}