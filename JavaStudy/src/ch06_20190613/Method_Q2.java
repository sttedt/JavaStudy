package ch06_20190613;

import java.util.Scanner;

public class Method_Q2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("숫자를 입력해 주세요");
		
		int p = sum2(s.nextInt(), s.nextInt());
		System.out.println("정수 사이의 합은 " + p);
		
		s.close();
	}
	
	
	static int sum(int i, int p) {

		double d = 0;

		if (i == p) {
			return i;
		}
		int n = i - p + 1;

		d = (i + p) * n / 2;

		return (int) d;
	}

	static int sum2(int i, int p) {
//10 1
		int total = 0;
		if (i < p) {
			for (int s = i; s <= p; s++) {
				total += s;
			}
		} else {
			for (int s = p; s <= i; s++) {
				total += s;
			}
		}
		return total;
	}
}
