package application;

import entities.Product;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product pd = new Product();	
		
		System.out.println("Enter the product data: ");
		System.out.print("Name: ");
		pd.name = sc.nextLine();
		System.out.print("Price: ");
		pd.price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		pd.quantity = sc.nextInt();
		
		pd.totalValueInStock();
		
		System.out.println("\nProduct data: " + pd.toString());
		
		System.out.print("\nEnter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		pd.addProducts(quantity);
		
		System.out.println("\nUpdate data: " + pd.toString());
		
		System.out.print("\nEnter the number of products to be removed in stock: ");
		quantity = sc.nextInt();
		pd.removeProducts(quantity);
		
		System.out.println("\nUpdate data: " + pd.toString());
		
		sc.close();
	}

}
