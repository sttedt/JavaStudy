package ch07;

import java.util.Calendar;

public class CalenderUtill {
	public static String getDate() {
		Calendar c = Calendar.getInstance();

		String date = "";
		int year = c.get((Calendar.YEAR));
		int month = c.get((Calendar.MONTH));
		int day = c.get((Calendar.DATE));

		date = year + "-" + (month < 10 ? "0" + month : month) + (day < 10 ? "0" + day : day);

		return date;

	}
}
