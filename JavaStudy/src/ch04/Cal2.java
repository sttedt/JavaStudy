package ch04;

import java.util.Calendar;

public class Cal2 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		// 현재 원의 1일로 날짜 설정
		cal.set(2019, 5, 1);
		int i = 1;
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DATE);
		int week = cal.get(Calendar.DAY_OF_WEEK);

		System.out.println("" + year + " " + month);

		int lastDay = cal.getActualMaximum(Calendar.DATE);
		
		for (; i < week; i++) {
			System.out.print("\t");
		}
		for (; day <= lastDay; day++) {
			System.out.print(day + "\t");
			if (week % 7 == 0) {
				System.out.println();
			}
			week++;
		}
	}
}
