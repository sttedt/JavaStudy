package ch06_20190613;

public class Mabang2 {
	public static void main(String[] args) {
		int[][] m = new int[5][5];

		m[0][2] = 1;
		
		int x = 0; //°¡·Î ÁÂÇ¥s
		int y = 2; //¼¼·Î ÁÂÇ¥

		for (int i = 2; i <= 25; i++) {
			x = x - 1;
			y = y - 1;

			if (x < 0) {

			} else {

			}
			
			m[x][y] = i;
		}

	}
}
