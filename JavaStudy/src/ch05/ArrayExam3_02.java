package ch05;

public class ArrayExam3_02 {
	public static void main(String[] args) {
		char[] numbers = { 'a', 'b', 'c', 'd', 'e' };
		
		char temp = ' ';
		for (int i = 0; i < 10000; i++) {
			int ran = (int) (Math.random() *5);

			temp = numbers[0];
			numbers[0] = numbers[ran];
			numbers[ran] = temp;
			
		}
		System.out.println(numbers);
	}
}