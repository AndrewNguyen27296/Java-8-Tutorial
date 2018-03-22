package com.infotech.localtime;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class LocalTimeClientTest {
	public static void main(String[] args) {
		
		//Print currentTime
		LocalTime currentTime1 = LocalTime.now();
		System.out.println(currentTime1);
		
		//Set currentTime
		LocalTime currentTime2 = LocalTime.parse("09:30");
		System.out.println(currentTime2);
		
		//Plus hour
		LocalTime of = LocalTime.of(9, 45);
		System.out.println(of);
		LocalTime plus = of.plus(1, ChronoUnit.HOURS);
		System.out.println(plus);
		
		//Check true/false localTime compare
		boolean before = LocalTime.parse("09:30").isBefore(LocalTime.parse("09:35"));
		System.out.println(before);
		
		//
		System.out.println("------------------------------------------------------");
		System.out.println(LocalTime.MAX);
		System.out.println(LocalTime.MIN);
		System.out.println(LocalTime.MIDNIGHT);
		System.out.println(LocalTime.NOON);
		ZoneId zoneId = ZoneId.of("Europe/Paris");
		System.out.println(LocalTime.now(zoneId));
	}
}
