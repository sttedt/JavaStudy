package ch07;

public class Exam7_3 {
	public static void main(String[] args) {
		/* Class7_3의 method1() 호출 */
		Class7_3 m = new Class7_3();
		m.method1();
	}
}

class Class7_3 {
	int a;

	public static void method1() {
		System.out.println("method1 실행 시작");
		Class7_3 m2 = new Class7_3();

		for (int i = 0; i < 5; i++) {
			m2.method2();
		}
		System.out.println("method1 실행 종료");
	}

	public void method2() {
		/* 전역변수 a의 값을 1씩 증가 */
		/* 전역변수 a의 값 출력 */
		// for (a = 1; a < 6; a++) {

		a += 1;
		System.out.println(a);
		// }

	}
}