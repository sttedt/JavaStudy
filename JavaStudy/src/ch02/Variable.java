package ch02;

import java.util.Scanner;

public class Variable {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력해 주세요.");
		//키보드 입력 숫자 가져오기
		int n = scan.nextInt(); 
		System.out.println("입력된 값은 : " + n);
		System.out.println((char) n );
		
		//키보드 입력 문자 가져오기
		String text = scan.next();
		System.out.println("입력된 값은 : " + text);
		scan.close();
	}
}