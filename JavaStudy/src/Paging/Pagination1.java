package Paging;

public class Pagination1 {
	public static void main(String[] args) {
		// ���� �������� ��ȣ
		int nowPage = 11;
		// ������ �̵��� ���� ǥ���Ǵ� �������� ���� ��ȣ
		int startPage = 0;

		// ������ �̵��� ���� ǥ���Ǵ� �������� �� ��ȣ
		int endPage = 0;
		startPage = ((nowPage - 1) / 10) * 10 + 1;
		endPage = startPage + 9;
		for (int i = startPage; i <= endPage; i++) {
			if (i == nowPage) {
				System.out.print("[" + i + "] ");
			} else {
				System.out.print(i + " ");
			}
		}
	}
}
