package ch12;

import java.util.Scanner;

public class Exam12_1_1 {
	static final int ASCII_A = 65, ASCII_Z = 90;
	static final int ASCII_a = 97, ASCII_z = 122;

	public static void main(String[] args) {
		System.out.print("아이디를 입력해주세요. => ");
		Scanner s = new Scanner(System.in);
		String id = s.nextLine();

		boolean isUpper = false;
		boolean isLower = false;

		/* 반복문을 이용하여 문자열로부터 문자 꺼내오기 */
		for (int i = 0; i < id.length(); i++) {
			char c = id.charAt(i);
			if (c >= ASCII_A && c <= ASCII_Z) {
				isUpper = true;
			} else if (c >= ASCII_a && c <= ASCII_z) {
				isLower = true;
			}
		}
		if(isUpper && isLower){
			System.out.println("정상");
		}else {
			System.out.println("실패");
		}
		s.close();
	}
}