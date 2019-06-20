package ch12;

public class CharAt {
	public static void main(String[] args) {
		String str = "Java Secure Coding";

		for (int i = 0; i < str.length(); i++) {
			
			char c = str.charAt(i);
			
			if (c >= 'A' && c <= 'Z') {
				c = (char) (c + 32);
			
			}System.out.print(c);
		}
	}
}
