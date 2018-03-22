package com.infotech.dateformatter;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class DateFormatterTest {

	public static void main(String[] args) {

		//Set DateTime of 2015
		LocalDateTime localDateTime = LocalDateTime.of(2015, Month.JANUARY, 25,6,30);
		System.out.println(localDateTime);
		
		//Format LocalDateTime to Date
		String format = localDateTime.format(DateTimeFormatter.ISO_DATE);
		System.out.println(format);
		
		//Format pattern localDateTime
		String format2 = localDateTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.println(format2);

		//Format LocalDateTime to UK style
		String format3 = localDateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).withLocale(Locale.UK));
		System.out.println(format3);
	}
	
}
