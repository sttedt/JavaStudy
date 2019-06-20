package Paging;

public class Pagination2 {
	public static void main(String[] args) {
		// 현재 페이지의 번호
		int nowPage = 1;

		// 페이지 이동을 위해 표현되는 페이지의 시작 번호
		int startPage = 0;

		// 페이지 이동을 위해 표현되는 페이지의 끝 번호
		int endPage = 0;
		// 전체 게시물 수
		int totalNumber = 57;
		int end = totalNumber / 10;
		/* 코드 작성 */

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
