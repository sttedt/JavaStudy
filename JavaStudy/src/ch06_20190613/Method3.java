package ch06_20190613;

public class Method3 {

	// �޼ҵ�
	static void third() {
		System.out.println("third ȣ��");
		System.out.println(4 / 0);
	}

	static void second() {
		third();
	}

	static void first() {
		second();
	}

	// ����
	public static void main(String[] args) {
		first();
	}
}
