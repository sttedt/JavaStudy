package Paging;

public class Pagination2 {
	public static void main(String[] args) {
		// ���� �������� ��ȣ
		int nowPage = 1;

		// ������ �̵��� ���� ǥ���Ǵ� �������� ���� ��ȣ
		int startPage = 0;

		// ������ �̵��� ���� ǥ���Ǵ� �������� �� ��ȣ
		int endPage = 0;
		// ��ü �Խù� ��
		int totalNumber = 57;
		int end = totalNumber / 10;
		/* �ڵ� �ۼ� */

		startPage = ((nowPage - 1) / 10) * 10 + 1;
		endPage = startPage + 9;

		if (totalNumber % 10 != 0) {
			end++;
		}
		if (endPage > end) {
			endPage = end;
		}

		for (int i = startPage; i <= endPage; i++) {
			if (i == nowPage) {
				System.out.print("[" + i + "] ");
			} else {
				System.out.print(i + " ");
			}

		}
	}
}
