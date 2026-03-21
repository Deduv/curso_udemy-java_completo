package app;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Main {

	public static void main(String[] args) {
		
		LocalDate d01 = LocalDate.parse("2026-03-21");
		LocalDateTime d02 = LocalDateTime.parse("2026-03-21T01:30:23");
		Instant d03 = Instant.parse("2026-03-21T01:30:23Z");
		
		LocalDate pastWeekLD = d01.minusDays(7);
		LocalDate nextWeekLD = d01.plusDays(7);
		LocalDate plusYearLD = d01.plusYears(1);
		
		LocalDateTime pastWeekT = d02.minusDays(7);
		LocalDateTime nextWeekT = d02.plusDays(7);
		LocalDateTime plusYearT = d02.plusYears(1);
		
		Instant pastWeekI = d03.minus(7, ChronoUnit.DAYS);
		Instant nextWeekI =d03.plus(7, ChronoUnit.DAYS);
		
		System.out.println("Past week = " + pastWeekLD);
		System.out.println("Next Week = " + nextWeekLD);
		System.out.println("Next year = " + plusYearLD);
		System.out.println("-----------------------------");
		
		System.out.println("Past week localdatetime = " + pastWeekT);
		System.out.println("Next Week localdatetime = " + nextWeekT);
		System.out.println("Next year localdatetime = " + plusYearT);
		System.out.println("-----------------------------");
		
		System.out.println("Past week instant= " + pastWeekI);
		System.out.println("Next Week instant = " + nextWeekI);
		System.out.println("-----------------------------");
		
		Duration t1 = Duration.between(pastWeekLD.atStartOfDay(), d01.atStartOfDay()); 
		Duration t2 = Duration.between(pastWeekT, d02);
		Duration t3 = Duration.between(pastWeekI, d03);
		Duration t4 = Duration.between(d03, pastWeekI);
		
		System.out.println("t1 dias = " + t1.toDays());
		System.out.println("t2 dias = " + t2.toDays());
		System.out.println("t3 dias = " + t3.toDays());
		System.out.println("t4 dias = " + t4.toDays());
		
	}

}
