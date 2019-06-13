package ch06_20190613;

public class Method3 {

	// 메소드
	static void third() {
		System.out.println("third 호출");
		System.out.println(4 / 0);
	}

	static void second() {
		third();
	}

	static void first() {
		second();
	}

	// 메인
	public static void main(String[] args) {
		first();
	}
}
