package com.infotech.localdate;

import java.time.Clock;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

/**
 * @author DiDongTraGop.vn
 *
 */
public class LocalDateTest {

	public static void main(String[] args) {
		//LocalDate format is yyyy-MM-dd used for birthday & payday 
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);
		
		//Print systemDefaultZone
		Clock clock = Clock.systemDefaultZone();
		LocalDate localDate2 = LocalDate.now(clock);
		System.out.println(localDate2);

		//Print zoneTime
		ZoneId zoneId = ZoneId.of("Europe/Paris");
		LocalDate localDate3 = LocalDate.now(zoneId);
		System.out.println(localDate3);
		
		//Set localDate
		System.out.println("-------------------------------------");
		LocalDate localDate4 = LocalDate.of(2017, 03, 02);
		System.out.println(localDate4);
		
		//Parse localDate
		LocalDate localDate5 = LocalDate.parse("2018-05-04");
		System.out.println(localDate5);
		
		//Plus number of day
		LocalDate localDate6 = localDate5.plusDays(2);
		System.out.println(localDate6);
		
		//Minus number of day
		LocalDate localDate7 = localDate5.minus(2, ChronoUnit.DAYS);
		System.out.println(localDate7);
		
		
	}

}
