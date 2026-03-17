/*Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
considerando a primeira posição como 0 (zero).*/


package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Posicao;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		Posicao p [] = new Posicao [n];
		
		for (int i = 0; i < p.length; i++) {
			System.out.print("Digite um numero: ");
			double num = sc.nextDouble();
			p[i] = new Posicao(num);
		}
		
		double maior = p[0].getNum();
		int posicao = 0;
		
		for (int i = 1; i < p.length; i++) {
			if (maior < p[i].getNum()) {
				maior = p[i].getNum();
				posicao = i;
			}
		}
		
		System.out.printf("%nMAIOR VALOR = %.1f%n", maior);
		System.out.println("POSICAO DO MAIOR VALOR = " + posicao);
		
		
		sc.close();
	}

}
