package ch04;

public class Exam4_03 {
	public static void main(String[] args) {
		int year = 2001;

		if (year % 4 == 0 & year % 400 == 0) {
			System.out.println("�����Դϴ�.");

		} else if (year % 100 == 0) {
			System.out.println("����Դϴ�.");
			
		} else {
			System.out.println("����Դϴ�.");
		}
	}
}
