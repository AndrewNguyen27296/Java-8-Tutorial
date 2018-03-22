package com.infotech.periodduration;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodAndDurationTest {
	public static void main(String[] args) {

		// Create initialDate-now and finalDay
		LocalDate initialDate = LocalDate.now();
		LocalDate finalDate = initialDate.plus(Period.ofDays(5));

		// Get day between now and 5 days later
		int days = Period.between(initialDate, finalDate).getDays();
		System.out.println(days);

		// Get day between now and 5 days later 2
		long between = ChronoUnit.DAYS.between(initialDate, finalDate);
		System.out.println(between);
	}
}
