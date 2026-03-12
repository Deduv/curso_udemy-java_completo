package application;

import entities.Data;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Data d = new Data();
		
		System.out.print("Name: "); 
		d.name = sc.nextLine();
		System.out.print("Gross salary: ");
		d.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		d.tax = sc.nextDouble();
		
		System.out.println("\nEmployee: " + d.toString());
		System.out.print("\nWhich percentage to increase salary? ");
		double percentage = sc.nextDouble();
		d.increaseSalary(percentage);
		
		System.out.println("\nUptade data: " + d.toString());
		
		sc.close();
	}

}
