package ch06_20190613;

import java.util.Scanner;

public class Method1 {
	
	//메소드 부분
	static int input() {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		s.close();
		return n;
	}
	
	public static void main(String[] args) {
		System.out.println("값을 입력해주세요.");
		int n = input();
		System.out.println("입력된 값은 ? " + n);
	}
}
