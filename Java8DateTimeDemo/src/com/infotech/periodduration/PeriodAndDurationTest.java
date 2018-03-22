package com.infotech.periodduration;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodAndDurationTest {
	public static void main(String[] args) {

		// Create initialDate-now and finalDate
		LocalDate initialDate = LocalDate.now();
		LocalDate finalDate = initialDate.plus(Period.ofDays(5));

		// Get day between now and 5 days later
		int days = Period.between(initialDate, finalDate).getDays();
		System.out.println(days);

		// Get day between now and 5 days later 2
		long between = ChronoUnit.DAYS.between(initialDate, finalDate);
		System.out.println(between);
		
		System.out.println("-------------------------------------");
		
		// Create initialTime-now and finalTime
		LocalTime initialTime = LocalTime.of(6, 30,0);
		LocalTime finalTime = initialTime.plus(Duration.ofSeconds(30));
		
		// Get time between now and 30 sec later
		long seconds = Duration.between(initialTime, finalTime).getSeconds();
		System.out.println(seconds);
		
		// Get time between now and 30 sec later 2
		long between2  = ChronoUnit.SECONDS.between(initialTime, finalTime);
		System.out.println(between2);
		
	}
}
