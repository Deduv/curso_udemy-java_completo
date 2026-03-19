package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List <Employee> list = new ArrayList<>();
		
		System.out.print("How many employees will be registred: ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("Employee #" + (i + 1) + ":");
			System.out.print("Id: ");
			Integer code = sc.nextInt();
			sc.nextLine();
			while (hasId(list, code)) {
				System.out.println("Id already taken! Try again: ");
				code = sc.nextInt();
				sc.nextLine();
			}
			
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			
			Employee emp = new Employee (code, name, salary);
			
			list.add(emp);
		}
		
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase :");
		int id = sc.nextInt();
		
		Employee emp = list.stream().filter(x -> x.getCode() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.print("This Id does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		}
		
		System.out.println();
		System.out.println("List of employees: ");
		
		list.forEach(System.out::println);
		
		
		sc.close();
	}
	
	public static boolean hasId(List<Employee> list, int code) {
		return list.stream().anyMatch(x -> x.getCode() == code);
	}
}

