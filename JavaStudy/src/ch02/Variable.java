package ch02;

import java.util.Scanner;

public class Variable {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("���ڸ� �Է��� �ּ���.");
		//Ű���� �Է� ���� ��������
		int n = scan.nextInt(); 
		System.out.println("�Էµ� ���� : " + n);
		System.out.println((char) n );
		
		//Ű���� �Է� ���� ��������
		String text = scan.next();
		System.out.println("�Էµ� ���� : " + text);
		scan.close();
	}
}