package application;

import java.util.ArrayList; 
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		List <Employee> list = new ArrayList <>();
		
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		sc.nextLine();
		System.out.println();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Employee #" + (i+1) + " data: ");
			System.out.print("Outsourced (y/ n)? ");
			char answer = sc.nextLine().charAt(0);
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Hours: ");
			int workedHours = sc.nextInt();
			
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			sc.nextLine();
			
			if (answer == 'n') {		
				list.add(new Employee(name, workedHours, valuePerHour));
			}
			else {		
				System.out.print("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				sc.nextLine();
				list.add(new OutsourcedEmployee(name, workedHours, valuePerHour, additionalCharge));
			}				
			
			System.out.println();
		}
		
		System.out.println("PAYMENTS: ");
		for (Employee emp : list) {
			System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
		}
			
		sc.close();
	}

}
