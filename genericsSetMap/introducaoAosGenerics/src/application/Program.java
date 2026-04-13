package application;

import java.util.Locale;
import java.util.Scanner;

import model.services.PrintService;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		PrintService <Integer> ps = new PrintService<>();
		
		System.out.print("How many values: ");
		Integer n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			Integer value = sc.nextInt();
			ps.addValue(value);
		}
		
		ps.print();
		Integer firstValue = ps.first();
		
		System.out.println("First value = " + firstValue);
		
		sc.close();

	}

}
