package com.infotech.localdatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTest {

	public static void main(String[] args) {
		// Current LocalDateTime
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);

		// Current LocalDateTime
		LocalDateTime localDateTime2 = LocalDateTime.of(LocalDate.now(), LocalTime.now());
		System.out.println(localDateTime2);

		// Set LocalDateTime
		LocalDateTime localDateTime3 = LocalDateTime.parse("2017-03-10T10:37:45");
		System.out.println(localDateTime3);

		// Separate Date&Time
		LocalDate localDate = localDateTime3.toLocalDate();
		LocalTime localTime = localDateTime3.toLocalTime();
		System.out.println(localDate);
		System.out.println(localTime);

	}

}
