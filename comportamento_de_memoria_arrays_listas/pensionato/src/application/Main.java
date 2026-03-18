package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Data;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		if (n > 10) {
			n = 10;
		}
		
		Data [] data = new Data [10];
		System.out.println();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Rent #" + (i + 1) + ":");
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			System.out.println();
			sc.nextLine();
			
			data[room] = new Data (name, email, room);
		}
		
		System.out.println("Busy rooms: ");
		
		for (int i = 0; i < data.length; i++) {
			if (data[i] != null) {
				System.out.println(data[i].getRoom() + ": " + data[i].getName() + ", " + data[i].getEmail());
			}
		}
		
		sc.close();
	}

}
