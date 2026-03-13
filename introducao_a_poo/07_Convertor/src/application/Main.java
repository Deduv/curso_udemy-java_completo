package application;

import entities.CurrencyConverter;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
			
		System.out.print("What is the dollar price? ");
		double price = sc.nextDouble();
		
		System.out.print("How many dollar will be bought? ");
		double amount = sc.nextDouble();
		
		System.out.println("Amont to be paid in reais = " + String.format("%.2f", CurrencyConverter.convert(price, amount)));
		sc.close();
	}

}
