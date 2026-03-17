/*Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.*/

package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Vetor;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double soma = 0.0, media = 0.0;
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		Vetor [] vet = new Vetor [n];
		
		for (int i = 0; i < vet.length; i++) {
			System.out.print("Digite um numero: ");
			double num = sc.nextDouble();
			vet [i] = new Vetor (num);
			soma += vet[i].getElementos();
		}
		
		media = soma / n;
		System.out.println("\nMEDIA DO VETOR = " + String.format("%.3f", media));
		
		System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
		for (int i = 0; i < vet.length; i++) {
			if (vet[i].getElementos() < media) {
				System.out.println(vet[i].getElementos());
			}
		}
		
		sc.close();
	}
}
