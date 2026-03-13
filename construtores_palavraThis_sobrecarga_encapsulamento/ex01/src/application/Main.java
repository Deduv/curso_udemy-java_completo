package application;

import java.util.Locale;
import java.util.Scanner;
import entities.AccontData;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		AccontData ac;
		
		System.out.print("Enter accont number: ");
		int number = sc.nextInt();
		
		System.out.print("Enter accont holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
				
		System.out.print("Is there an initial deposit (y/n)?");
		char option = sc.next().charAt(0);
		
		if (option == 's') {
			System.out.println("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			ac = new AccontData(number, holder, initialDeposit);		
		} 
		else {
			ac = new AccontData(number, holder);
		}
		
		sc.close();
	}

}
