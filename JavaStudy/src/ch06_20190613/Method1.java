package ch06_20190613;

import java.util.Scanner;

public class Method1 {
	
	//�޼ҵ� �κ�
	static int input() {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		s.close();
		return n;
	}
	
	public static void main(String[] args) {
		System.out.println("���� �Է����ּ���.");
		int n = input();
		System.out.println("�Էµ� ���� ? " + n);
	}
}
