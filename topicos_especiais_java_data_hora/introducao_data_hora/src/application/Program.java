//instanciar uma data a partir do insatante atual
//LocalDate
//LocalDateTime
//Instant 
//Transformar um texto ISO8601 --> Data-Hora

package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		//https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/time/format/DateTimeFormatter.html
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		LocalDate d04 = LocalDate.parse("2026-03-20");
		LocalDateTime d05 = LocalDateTime.parse("2026-03-20T15:41:39");
		Instant d06 = Instant.parse("2026-03-20T15:46:54Z");
		Instant d07 = Instant.parse("2026-03-20T15:46:54-03:00");
		LocalDate d08 = LocalDate.parse("20/03/2026", dtf);
		LocalDateTime d09 = LocalDateTime.parse("20/03/2026 01:30", dtf1);
		LocalDate d10 = LocalDate.of(2026, 3, 20);
		LocalDateTime d11 = LocalDateTime.of(2026, 3, 20, 1, 30);
		
//por estar uando "println" implicitamente estou usando .toString() do meu objeto, que por padrao gera o texto no fomrato ISO601 
		
		System.out.println("d01 = " + d01);
		System.out.println("d02 = " + d02);
		System.out.println("d03 = " + d03);
		System.out.println("d04 = " + d04);
		System.out.println("d05 = " + d05);
		System.out.println("d06 = " + d06);
		System.out.println("d07 = " + d07);
		System.out.println("d08 = " + d08);
		System.out.println("d09 = " + d09);
		System.out.println("d10 = " + d10);
		System.out.println("d11 = " + d11);

	}

}
