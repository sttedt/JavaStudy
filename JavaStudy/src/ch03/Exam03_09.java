package ch03;

import java.util.Scanner;

public class Exam03_09 {
	public static void main(String[] args) {
		char ch = 0;
		System.out.println("���ĺ��� �Է��ϼ���.");
		Scanner scan = new Scanner(System.in);
		String ss = scan.next();
		ch = ss.charAt(0);

		char lowerCase = (char) ((64 < ch & ch < 91) ? (ch + 32) : ch);
		System.out.println("�Է°� : " + ch);
		System.out.println("�ҹ��� ���氪 : " + lowerCase);

		scan.close();

	}

}
