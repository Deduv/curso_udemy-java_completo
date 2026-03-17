/*Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.*/

package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Negativos;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		Negativos negativos [] = new Negativos[n];
		
		for(int i = 0; i < negativos.length; i++) {
			int number = sc.nextInt();
			
			negativos[i] = new Negativos(number);
		}
		System.out.println("\nNUMEROS NEGATIVOS: ");
		for(int i = 0; i < negativos.length; i++) {
			if (negativos[i].getNumber() < 0) {
				System.out.println(negativos[i].getNumber());
			} 
		}
		
		sc.close();
	}

}
