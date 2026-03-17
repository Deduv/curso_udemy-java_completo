/* Fazer um problema para ler um numero inteiro N e os dados (nome e preço) de N produtos. Armazene os N produtos em um vetor.
 * Em seguida, mostrar o preço médio dos produtos. */

package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class ProblemaEx2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		n = sc.nextInt();
		
		Product vect [] = new Product [n];
		
		double sum = 0.0;
		double averagePrice = 0.0;
		
		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			
			vect[i] = new Product(name, price);
			sum += vect[i].getPrice();
		}
		
		averagePrice = sum / vect.length;
		
		System.out.println("AVERAGE PRICE = $" + String.format("%.2f", averagePrice));
		
		sc.close();
	}

}
