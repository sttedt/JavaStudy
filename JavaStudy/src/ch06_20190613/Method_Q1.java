package ch06_20190613;

import java.util.Scanner;

public class Method_Q1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("���Ը� �Է��� �ּ���.");
		
		int p =  rank2(s.nextInt());
		System.out.println(p+"����Դϴ�.");
		
		s.close();
	}

	static int rank(int r) {
		
		if (r > 10) {
			System.out.println("1���");
		} else if (r > 7) {
			System.out.println("2���");
		} else if (r > 4) {
			System.out.println("3���");
		} else {
			System.out.println("4���");
		}
		return r;
	}

	
	static int rank2(int r) {
		
		if (r >= 10) {
			return 1;
		} else if (r > 7) {
			return 2;
		} else if (r > 4) {
			return 3;
		} else {
			return 4;
		}
	}
}
