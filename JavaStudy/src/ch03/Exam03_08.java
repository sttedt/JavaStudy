package ch03;

import java.util.Scanner;

public class Exam03_08 {
	public static void main(String[] args) {
		int num = 0;
		System.out.println("�����Է� �ϼ��� >>");
		
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		      
		String a = num > 0 ? "���" : (num < 0 ? "����" : "0 �Դϴ�.");
		System.out.println(a);   
		
		scan.close();
		
	}

}
