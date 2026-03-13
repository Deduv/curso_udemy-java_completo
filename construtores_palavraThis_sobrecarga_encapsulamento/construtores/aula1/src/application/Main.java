package application;

import entities.Product;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		int quantity = sc.nextInt();
		
		Product pd = new Product(name, price, quantity);
		
		pd.totalValueInStock();
		
		System.out.println("\nProduct data: " + pd.toString());
		
		System.out.print("\nEnter the number of products to be added in stock: ");
		quantity = sc.nextInt();
		pd.addProducts(quantity);
		
		System.out.println("\nUpdate data: " + pd.toString());
		
		System.out.print("\nEnter the number of products to be removed in stock: ");
		quantity = sc.nextInt();
		pd.removeProducts(quantity);
		
		System.out.println("\nUpdate data: " + pd.toString());
		
		sc.close();
	}

}