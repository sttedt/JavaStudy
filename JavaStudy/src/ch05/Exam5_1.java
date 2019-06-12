package ch05;

public class Exam5_1 {
	public static void main(String[] args) {

		String sep = "";

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		for (int i = 0; i < arr.length; i++) {
			//배열 순번이기 때문에 == 로 조건을 설정해야 홀수가 나온다
			/* if (i % 2 == 0) { 
			* System.out.print(sep + arr[i]); 
			* sep = ","; 
			* }
			*/
			
			int v = arr[i]; // 배열 속 데이터 값을 지정
			if (v % 2 != 0) { // 그 후 데이터 값으로 연산
				System.out.print(sep + v);
				sep = ",";
			}
		}
	}
}