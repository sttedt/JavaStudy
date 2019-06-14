package ch06_20190613;

import java.util.Scanner;

public class Method_Q2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("숫자를 입력해 주세요");
		
		int p = getBetweenSum(s.nextInt(), s.nextInt());
		System.out.println("정수 사이의 합은 " + p);
		
		s.close();
	}
	
	
	static int sum(int i, int p) {

		int t = 0;

		if (i == p) {
			return i;
		}
		int n = i - p + 1;

		t = (i + p) * n / 2;

		return t;
	}

	static int sum2(int i, int p) {
//10 1
		int total = 0;
		if(i == p) {
			total = i;
			return total;
		}
		
		else if (i < p) {
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
	
	static int getBetweenSum(int a, int b) {
//		a = (a > b) ? a : b;
		if(a > b) {
			int temp = a;
			a = b;
			b = temp;
		} 
		
		int total = 0;
		
		for(int s = a; s <= b; s++) {
			total = total + s;
		}
		
		return total;
	}
}
