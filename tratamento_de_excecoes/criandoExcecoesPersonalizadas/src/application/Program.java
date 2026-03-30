package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Reservation;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy");
		
		System.out.print("Room number: ");
		Integer roomNumber = sc.nextInt();
		System.out.print("Checkin date (dd/MM/yyyy): ");
		Date checkin = sdf.parse(sc.next());
		System.out.print("Checkout date (dd/MM/yyyy): ");
		Date checkout = sdf.parse(sc.next());	
		
		Reservation rst = new Reservation(roomNumber, checkin, checkout);
		
		if(!checkout.after(checkin)) {
			System.out.println("Error in reservation. Check-out date must be after check-in date");
		}
		else {
			System.out.println("Reservation: " + rst.toString());
			
			
			System.out.println("\nEnter data to update the reservation: ");
			System.out.print("Checkin date (dd/MM/yyyy): ");
			checkin = sdf.parse(sc.next());
			System.out.print("Checkout date (dd/MM/yyyy): ");
			checkout = sdf.parse(sc.next());
			
			Date now = new Date ();
			
			if (checkin.before(now) || checkout.before(now)) {
				System.out.println("Error in reservation: Reservation dates for update must be future dates");
			}
			else if (!checkout.after(checkin)) {
				System.out.println("Error in reservation: Check-out date must be after check-in date");
			}
			else {
				rst.updateDates(checkin, checkout);
				System.out.println("Reservation: " + rst.toString());
			}
		}
		
			sc.close();
	}

}
