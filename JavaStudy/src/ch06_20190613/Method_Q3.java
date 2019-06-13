package ch06_20190613;

import java.util.Scanner;

public class Method_Q3 {
	static int ly(int m) {
		if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
			return 31;
		} else if (m == 4 || m == 6 || m == 9 || m == 11) {
			return 30;
		}else {
			return 28;
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("검색하실 월을 입력해 주세요.");
		
		int input = s.nextInt();
		int m = ly(input);
		System.out.println( input+ "월의 마지막 날짜는 " + m + "일 입니다.");
		
		s.close();
	}
}
