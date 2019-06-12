package ch04;

public class Gugudan1 {
	public static void main(String[] args) {
		int i = 1;
		int j = 1;

		for (i = 1; i <= 9; i++) {
			for (j = 2; j <= 9; j++) {
				System.out.print(j + " * " + i + " = " + (i * j) + "\t");
			}
			System.out.println();
		}
	}
}
