package ch06_20190613;

public class Method2 {
	//메소드 생성
	static boolean signUp(String id, String pw) {
		
		// id 자리수 검사
		if (id.length() < 4) {
			return false;
		}
		
		// pw 자리수 검사
		if (pw.length() < 8) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		
		boolean result =  signUp("asdf", "alkvn");
		if(result) {
			System.out.println("성공");
		}else {
			System.out.println("실패");
		}
	}
}
