package ch06_20190613;

public class Method2 {
	//�޼ҵ� ����
	static boolean signUp(String id, String pw) {
		
		// id �ڸ��� �˻�
		if (id.length() < 4) {
			return false;
		}
		
		// pw �ڸ��� �˻�
		if (pw.length() < 8) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		
		boolean result =  signUp("asdf", "alkvn");
		if(result) {
			System.out.println("����");
		}else {
			System.out.println("����");
		}
	}
}
