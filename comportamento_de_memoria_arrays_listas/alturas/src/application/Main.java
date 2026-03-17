/*Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
bem como os nomes dessas pessoas caso houver.*/


package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Data;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double somaAltura = 0.0, mediaAltura = 0.0, porcentagem16anos;
		int cont16anos = 0;
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		Data data [] = new Data [n];
		
		for (int i = 0; i < data.length; i ++) {
			System.out.println("Dados da " + (i + 1) + "ª pessoa:");
			System.out.print("Nome: ");
			String name = sc.nextLine();		
			System.out.print("Idade: ");
			int age = sc.nextInt();		
			System.out.print("Altura: ");
			double height = sc.nextDouble();
			sc.nextLine();
			
			data [i] = new Data(name, height, age);
			
			somaAltura += data[i].getHeight();
			
			if (data[i].getAge() < 16) {
				cont16anos ++;
			}
		}
		
		mediaAltura = somaAltura / n;
		porcentagem16anos = ((double) cont16anos * 100.00) / n;  
		
		System.out.println("\nAltura media: " + String.format("%.2f", mediaAltura));
		System.out.println("Pessoas com menos de 16 anos: " + String.format("%.2f", porcentagem16anos) + "%");
		
		
		for (int i = 0; i < data.length; i++) {
			if (data[i].getAge() < 16) {
				System.out.println(data[i].getName());;
			}
		}	
		
		sc.close();
	}

}
