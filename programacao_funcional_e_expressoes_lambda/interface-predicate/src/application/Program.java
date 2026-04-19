package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Product;


public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		List <Product> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("Hd Case", 80.90));
		
		System.out.print("Enter the min value: ");
		double minValue = sc.nextDouble();
		
		list.removeIf(p -> p.getPrice() >= minValue); 
		
		list.forEach(p -> System.out.println(p));
		
		sc.close();
	}

}
