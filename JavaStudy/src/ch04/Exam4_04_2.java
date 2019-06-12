package ch04;

public class Exam4_04_2 {
	public static void main(String[] args) {

		int i = 1;
		int total = 0;

		for (; i <= 1000; i++) {
			if (i % 7 == 0 & i % 2 == 0) {
				total = total + i;
			}
		}
		System.out.println(total);
	}
}

// 2와 7의 배수의 합