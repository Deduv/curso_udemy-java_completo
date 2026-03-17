/*Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
de homens.*/

package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Data;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		
		Data pessoa [] = new Data [n];
		
		for (int i = 0; i < pessoa.length; i++) {
			System.out.print("Altura da " + (i + 1) + "ª pessoa: ");
			double altura = sc.nextDouble();
			sc.nextLine();
			System.out.print("Genero da " + (i + 1) + "ª pessoa: ");
			char genero = sc.nextLine().charAt(0);
			pessoa[i] = new Data(altura, genero);
		}
		
		double menorAltura = pessoa[0].getAltura();
		double maiorAltura = pessoa[0].getAltura();
		int contMulheres = 0, contHomens = 0;
		double somaMulheres = 0.0, mediaMulheres = 0.0;
		
		for (int i = 0; i < pessoa.length; i++) {
			if (pessoa[i].getAltura() < menorAltura ) {
				menorAltura = pessoa[i].getAltura();
			}
			if (pessoa[i].getAltura() > maiorAltura) {
				maiorAltura = pessoa[i].getAltura();
			}
			
			if(pessoa[i].getGenero() == 'F') {
				contMulheres++;
				somaMulheres += pessoa[i].getAltura();
			} 
			else {
				contHomens++;
			}
			
		}
		
		if(contMulheres > 0) {
			mediaMulheres = somaMulheres / contMulheres;
		}
		
		System.out.println("\nMenor altura = " + String.format("%.2f", menorAltura));
		System.out.println("Maior altura = " + String.format("%.2f", maiorAltura));
		System.out.println("Media das alturas das mulheres = " + String.format("%.2f", mediaMulheres));
		System.out.println("Numero de homens = " + contHomens);
		
		sc.close();
	}

}
