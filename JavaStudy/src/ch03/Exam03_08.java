package ch03;

import java.util.Scanner;

public class Exam03_08 {
	public static void main(String[] args) {
		int num = 0;
		System.out.println("숫자입력 하세요 >>");
		
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		      
		String a = num > 0 ? "양수" : (num < 0 ? "음수" : "0 입니다.");
		System.out.println(a);   
		
		scan.close();
		
	}

}
