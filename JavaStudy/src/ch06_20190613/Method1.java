package ch06_20190613;

import java.util.Scanner;

public class Method1 {
	
	//�޼ҵ� �κ�
	static int i() {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		s.close();

		return n;
	}
	
	public static void main(String[] args) {
		
		System.out.println("���� �Է����ּ���.");
		
		int n = i();
		
		System.out.println("�Էµ� ���� ? " + n);
	}
}
