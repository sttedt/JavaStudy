package ch04;

public class Exam03_07 {
	public static void main(String[] args) {
		  int num = 1234567892;
		  int total =  0;
		  for(; num > 0; num = num /10) {
			  int n = num % 10;
			  
			  total = total + n;
		  }
		  System.out.println(total);		  
	}

}

//�� �ڸ����� �� for���� �̿��� ���