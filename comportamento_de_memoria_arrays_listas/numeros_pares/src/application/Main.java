package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Data;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int contPares = 0;
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		Data data [] = new Data [n];
		
		for (int i = 0; i < data.length; i++) {
			System.out.print("Digite um numero: ");
			int num = sc.nextInt();	
			data[i] = new Data (num);
		}
		
		System.out.println("\nNUMEROS PARES: ");
		
		for (int i = 0; i < data.length; i++) {
			if (data[i].getNum() % 2 == 0) {
				System.out.print(data[i].getNum() + "  ");
				contPares++;
			}
		}
		
		System.out.println("\n\nQUANTIDADE DE PARES = " + contPares);
		
		sc.close();
	}

}
