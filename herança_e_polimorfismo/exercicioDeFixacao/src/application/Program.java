package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.AccountData;
import entities.CompanyAccountData;
import entities.IndividualAccountData;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		List <AccountData> list = new ArrayList <>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Tax payer #" + (i + 1) + " data: ");
			System.out.print("Individual or company (i/c)? ");
			char choose = sc.nextLine().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();
			sc.nextLine();
			
			if (choose == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				list.add(new IndividualAccountData(name, anualIncome, healthExpenditures));
			} else {
				System.out.print("Number of employees: ");
				int numberOfEmployees = sc.nextInt();
				list.add(new CompanyAccountData(name, anualIncome, numberOfEmployees));
			}
			
		}
		
		System.out.println();
		double sum = 0.0;
		
		System.out.println("TAXED PAID: ");
		for (AccountData acd : list) {
			System.out.println(acd.getName() + ": $ " + String.format("%.2f", acd.taxPaid()));
			double tax = acd.taxPaid();
			sum += tax;
		}
		
		System.out.println();
		
		System.out.println(String.format("TOTAL TAXES: $ " + "%.2f", sum));
		
		sc.close();
	}
}
		