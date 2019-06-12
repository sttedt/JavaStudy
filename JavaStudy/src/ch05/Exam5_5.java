package ch05;

public class Exam5_5 {
	public static void main(String[] args) {
		int[][] arr = { { 95, 86 }, { 83, 92, 96 }, { 78, 83, 93, 87, 88 } };

		int sum = 0;
		double avg = 0.0;
		int count = 0;

		// 코드 작성

		for (int i = 0; i < arr.length; i++) {
			for (int p = 0; p < arr[i].length; p++) {
				sum += arr[i][p];
					count++;
			}
		}
		avg = (double) sum / count;

		System.out.println(count);
		System.out.println("합 : " + sum);
		System.out.println("평균 : " + avg);
	}
}