package ch05;

public class arr1 {
	public static void main(String[] args) {
		int[] arr = new int[5];
		arr[3] = 300;

		// System.out.println(arr[0]);
		// System.out.println(arr[3]);
		// System.out.println(arr[8]);

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
//배열 기본