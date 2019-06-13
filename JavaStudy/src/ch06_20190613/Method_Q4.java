package ch06_20190613;

import java.util.Scanner;

public class Method_Q4 {
	static String d(boolean a, boolean b) {

		if (a && b) {
			return "5년";
		}else if (!a&& b) {
			return "B 5년 복역";
		}else if (a&& !b) {
			return "A 5년 복역";
		}else if (!a&& !b) {
			return "1년";
		}

		return "";
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		if(s.equals("t")) {
			
		
//		a.equals("t");
		
		String a = d(s.nextBoolean(), s.nextBoolean());
		
		System.out.println(a);
		
		s.close();
		}else if(s.equals("f")) {

			String a = d(s.nextBoolean(), s.nextBoolean());
			
			System.out.println(a);
			s.close();
		}else {
			System.out.println("t 와 f 중 입력해 주세요.");
		}
		
	}
}
