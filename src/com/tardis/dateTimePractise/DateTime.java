package com.tardis.dateTimePractise;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

// Java 8 - New Date-Time API
public class DateTime {
	
	public DateTime() {
		
	}
	
	public void testDateTime() {
		
		// Get Local Date & Time
		this.getDateTimeNow();
		
		// Format today
		this.formatDate(LocalDate.now());
		
		// Custom Formatter
		this.customFormatDateTime(LocalDateTime.now());
		
		// Convert String to Date
		this.convertStringToDate("25.09.2019");
		
		// Get Day of Week
		this.getTodayDayOfWeek(LocalDate.now());
	}
	
	private void getDateTimeNow() {
		
		System.out.println();
		System.out.println("Get Date & Time");
		System.out.println("===============");
		System.out.println();
		
		// Local Time - no format
		LocalTime localTime = LocalTime.now();
		System.out.println("Local time: " + localTime);
		
		// Local Date - no format
		LocalDate localDate = LocalDate.now();
		System.out.println("Local date: " + localDate);
		
		// Local Date & Time - no format
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("Local date & time: " + localDateTime);
		
		LocalTime localTimeOnly = localDateTime.toLocalTime();
		System.out.println("Local time from date-time: " + localTimeOnly);
		
		LocalDate localDateOnly = localDateTime.toLocalDate();
		System.out.println("Local date from date-time: " + localDateOnly);

		// Timestamp
		
		System.out.println();
		
		Instant instant = Instant.now();
		
		long timeStampMillis = instant.toEpochMilli();
		System.out.println("Timestamp in milliseconds: " + timeStampMillis);

		long timeStampSeconds = instant.getEpochSecond();
		System.out.println("Timestamp in seconds: " + timeStampSeconds);
	}
	
	private void formatDate(LocalDate localDate) {
		
		System.out.println();
		System.out.println("Get Date & Time");
		System.out.println("===============");
		System.out.println();
		
		System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).format(localDate));
		System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).format(localDate));
		System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).format(localDate));
		System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).format(localDate));
		
	}
	
	private void customFormatDateTime(LocalDateTime localDateTime) {
		
		System.out.println();
		System.out.println("Custom Formatter");
		System.out.println("================");
		System.out.println();
		
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		
		System.out.println(dateFormatter.format(localDateTime.toLocalDate()));
	}
	
	private void convertStringToDate(String dateString) {
		
		System.out.println();
		System.out.println("Convert String to Date");
		System.out.println("======================");
		System.out.println();
		
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		LocalDate localDate = LocalDate.from(dateFormatter.parse(dateString));
		System.out.println(localDate);
		
	}
	
private void getTodayDayOfWeek(LocalDate localDate) {
		
	System.out.println();
	System.out.println("Get Day of Week");
	System.out.println("===============");
	System.out.println();

	System.out.println(localDate.getDayOfWeek());
	System.out.println();
		
	}
	

}
