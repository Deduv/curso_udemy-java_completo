/*Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
- Imprimir todos os elementos do vetor
- Mostrar na tela a soma e a média dos elementos do vetor*/

package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Soma;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		double sum = 0.0, average = 0.0;
		Soma soma [] = new Soma [n];
		
		for (int i = 0; i < soma.length; i++) {
			System.out.print("Digite um numero: ");
			double num = sc.nextDouble();
			soma[i] = new Soma (num);
		}
		
		System.out.print("\n\nVALORES = ");
		for (int i = 0; i < soma.length; i++) {
			System.out.print(soma[i].getNum() + " ");
			sum += soma[i].getNum();
		}
		average = sum / n;
		System.out.println("\nSOMA = " + String.format("%.2f", sum));
		System.out.println("MEDIA = " + String.format("%.2f", average));
		
		
		sc.close();
	}

}
