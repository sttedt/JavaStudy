package ch05;

public class Exam5_1 {
	public static void main(String[] args) {

		String sep = "";

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		for (int i = 0; i < arr.length; i++) {
			//�迭 �����̱� ������ == �� ������ �����ؾ� Ȧ���� ���´�
			/* if (i % 2 == 0) { 
			* System.out.print(sep + arr[i]); 
			* sep = ","; 
			* }
			*/
			
			int v = arr[i]; // �迭 �� ������ ���� ����
			if (v % 2 != 0) { // �� �� ������ ������ ����
				System.out.print(sep + v);
				sep = ",";
			}
		}
	}
}