package ch06_20190613;

import java.util.Scanner;

public class Mabang {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[][] m = new int[n][n];

		int x = 0;
		int y = n / 2;
		m[x][y] = 1;

		for (int i = 2; i <= n * n; i++) {
			// 다음 숫자를 찍을 좌표 (좌측 대각선)
			x = x - 1;
			y = y - 1;

			if (x < 0) { // 세로축이 음수일때
				if (y >= 0) {
					x = x + n;
				}

			}
		}s.close();
	}
}
