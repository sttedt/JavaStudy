package ch03;

public class Oper2 {
	public static void main(String[] args) {
		int num = 2324;
		int n1 = num % 10;
		int n2 = num / 10 % 10;
		int n3 = num / 100 % 10;
		int n4 = num / 1000 % 10;
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);
		
		System.out.println("각 자리수의 합은 : " + (n1+n2+n3+n4));
	}
}
