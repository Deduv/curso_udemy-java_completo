package application;

import java.util.Locale;
import java.util.Scanner;
import entities.AccontData;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		AccontData account;
		
		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter account holder: ");
		String holder = sc.nextLine();
		
		System.out.print("Is there an initial deposit(y/n) ? ");
		char option = sc.nextLine().charAt(0);
		
		if(option == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new AccontData(accountNumber, holder, initialDeposit);
		} 
		else {
			account = new AccontData(accountNumber, holder);
		}
		
		System.out.println("\nAccount Data: " + "\n" + account.toString());
		
		System.out.print("\nEnter a deposit value: ");
		double deposite = sc.nextDouble();
		account.deposite(deposite);
		
		System.out.println("Uptaded account data: " + "\n" + account.toString());
		
		
		System.out.print("\nEnter a withdraw value: ");
		double withdraw = sc.nextDouble();
		account.withdraw(withdraw);
		
		System.out.println("Uptaded account data: " + "\n" + account.toString());
		
		sc.close();
		
	}

}
