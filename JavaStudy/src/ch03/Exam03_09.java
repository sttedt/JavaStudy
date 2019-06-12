package ch03;

import java.util.Scanner;

public class Exam03_09 {
	public static void main(String[] args) {
		char ch = 0;
		System.out.println("알파벳을 입력하세요.");
		Scanner scan = new Scanner(System.in);
		String ss = scan.next();
		ch = ss.charAt(0);

		char lowerCase = (char) ((64 < ch & ch < 91) ? (ch + 32) : ch);
		System.out.println("입력값 : " + ch);
		System.out.println("소문자 변경값 : " + lowerCase);

		scan.close();

	}

}
