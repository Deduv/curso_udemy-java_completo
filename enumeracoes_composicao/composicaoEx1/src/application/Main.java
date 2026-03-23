package application;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Main {

	public static void main(String[] args) throws java.text.ParseException {
		
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter the department's name: ");
		String departmentName = sc.nextLine();
		
		System.out.println("Enter worker data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		
		System.out.print("Level: ");
		String level = sc.nextLine();
		
		System.out.print("Base salary: ");
		double baseSalary = sc.nextDouble();
		
		sc.nextLine();
		
		Worker worker = new Worker(name, WorkerLevel.valueOf(level), baseSalary, new Department(departmentName));
		
		System.out.print("How many contracts to this worker? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the #" + (i + 1) + " data:");
			
			System.out.print("DATE (DD/ MM/ YYYY): ");
			Date contractDate = sdf.parse(sc.next());
			
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			
			System.out.print("Duration (hours): ");
			int duration = sc.nextInt();
			sc.nextLine();
			
			HourContract contract = new HourContract(contractDate, valuePerHour, duration);
			worker.addContract(contract);
		}
		
		System.out.println();
		System.out.print("Enter month and year to calculate income (MM/ YYYY): ");
		String monthAndYear = sc.nextLine();
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.println("Income for: " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));
		
		
		
		
		sc.close();
	}

}
