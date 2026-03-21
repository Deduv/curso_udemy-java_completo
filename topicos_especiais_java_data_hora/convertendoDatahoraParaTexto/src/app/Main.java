package app;

import java.time.Instant; 
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		
		//https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/time/format/DateTimeFormatter.html
		
		LocalDate d01 = LocalDate.parse("2026-03-21");
		LocalDateTime d02 = LocalDateTime.parse("2026-03-21T13:02:23");
		Instant d03 = Instant.parse("2026-03-21T13:02:23Z");
				
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		DateTimeFormatter dtf4 = DateTimeFormatter.ISO_DATE_TIME;
				
		System.out.println("d01 = " + d01.format(dtf1));
		System.out.println("d01 = " + dtf1.format(d01));
		System.out.println("d01 = " + d01.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		System.out.println("d02 = " + d02.format(dtf1));
		System.out.println("d02 = " + d02.format(dtf2));
		System.out.println("d02 = " + dtf4.format(d02));
		
		System.out.println("d03 = " + dtf3.format(d03));
		System.out.println("d03 = " + dtf3.format(d03));
		System.out.println("d03 = " + dtf3.format(d03));
		
	}

}


