package ch05;

public class Exam5_3 {
	public static void main(String[] args) {
		char[] nums = { 'a', 'b', 'c', 'd', 'e', 'f', 'g' };
		// ����
		for (int i = 0; i < nums.length; i++) {
			char temp = ' ';
			int ran = (int) (Math.random() * nums.length);

			temp = nums[0];
			nums[0] = nums[ran];
			nums[ran] = temp;
		}
		// ���
		int count = 1;
		for (int i = 0; i < nums.length; i++) {

			System.out.print(nums[i] + "\t");
			if (count % 3 == 0) {
				System.out.println();
			}
			count++;
		}
	}
}