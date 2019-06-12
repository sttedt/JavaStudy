package ch05;

public class ArrayExam1 {
	public static void main(String[] args) {
		int[] arr1 = new int[3];
		int[] arr2 = new int[] { 10, 20, 30 };
		int[] arr3 = { 100, 200, 300 };
		arr1[0] = 1;
		arr1[1] = 2;
		arr1[2] = 3;

		for (int i = 0; i < 3; i++) {
			System.out.println(arr1[i]);
		}
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
	}
}