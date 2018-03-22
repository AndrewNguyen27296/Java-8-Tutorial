package com.infotech.localdatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class ConvertOldDateIntoNewDateTest {
	public static void main(String[] args) {
		Date date = new Date();

		// Current DateTime
		LocalDateTime localDateTime = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
		System.out.println(localDateTime);

		// Current Time
		LocalTime localTime = localDateTime.toLocalTime();
		System.out.println(localTime);

		// Current Date
		LocalDate localDate = localDateTime.toLocalDate();
		System.out.println(localDate);

		// Calendar
		Calendar calendar1 = Calendar.getInstance();
		LocalDateTime localDateTime2 = LocalDateTime.ofInstant(calendar1.toInstant(), ZoneId.systemDefault());
		System.out.println(localDateTime2);
	}
}
