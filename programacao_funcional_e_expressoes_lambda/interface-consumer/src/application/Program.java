package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List <Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("Hd Case", 80.90));
		
		System.out.print("Enter the percentual increase: ");
		double increase = sc.nextDouble();
		double factor = 1 + (increase / 100.0);
		
		list.forEach(p -> p.setPrice(p.getPrice() * factor));
		
		list.forEach(System.out::println);
		
		sc.close();
	}

}
