package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Product;
import model.service.CalculationService;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String [] productNameOG = {"Computer", "Iphone X", "Tablet"};
		double [] productPriceOG = {890.50, 910.00, 550.50};
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("/home/big_ed/genericosDelimitados/products.txt"))) {
			for (int i = 0; i < productNameOG.length; i++) {
				bw.write(productNameOG[i] + ", " + productPriceOG[i]);
				bw.newLine();
			}
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
			
		List <Product> list = new ArrayList<>();
		
		try(BufferedReader br = new BufferedReader(new FileReader("/home/big_ed/genericosDelimitados/products.txt"))) {
			String line = br.readLine();
			while (line != null) {
				String [] fields = line.split(", ");
				list.add(new Product(fields[0], Double.parseDouble(fields[1])));
				line = br.readLine();
			}
			
			Product x = CalculationService.max(list);
			System.out.println("Most expensive: ");
			System.out.println(x);
			
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}		
			
		sc.close();
	}

}
