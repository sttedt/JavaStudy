package ch04;

public class Gugudan2 {
	public static void main(String[] args) {

		int i, j, k;

		j = 1;

		for (k = 2; k <= 9; k = k + 3) {
			for (i = 1; i <= 9; i++) {
				for (j = k; j < k + 3; j++) {
					if(j >= 10) break;
					System.out.print(j + " * " + i + " = " + (i * j) + "\t");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
