package Paging;

public class Pagination1 {
	public static void main(String[] args) {
		// 현재 페이지의 번호
		int nowPage = 11;
		// 페이지 이동을 위해 표현되는 페이지의 시작 번호
		int startPage = 0;

		// 페이지 이동을 위해 표현되는 페이지의 끝 번호
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
