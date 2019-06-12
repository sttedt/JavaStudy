package ch03;


public class Oper1 {
	public static void main(String[] args) {
		System.out.println(3<1);
		System.out.println(3<10);
		
		boolean b = 3 < 1 & 10 > 3 ;
		System.out.println(b);
		
		boolean b2 = 3 < 1 | 10 > 3;
		System.out.println(b2);
	}
}
