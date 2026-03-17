/*Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
digitado, mostrar a mensagem "NENHUM NUMERO PAR"*/

package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Vetor;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int contPares = 0, somaPares = 0;
		double mediaPares = 0.0;
			
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		Vetor [] vet = new Vetor [n];
		
		for (int i = 0; i < vet.length; i++) {
			System.out.print("Digite um numero: ");
			int num = sc.nextInt();
			vet [i] = new Vetor (num);
			
			if (vet[i].getNum() % 2 == 0) {
				contPares ++;
				somaPares += vet[i].getNum();
			}
		}
		
		if (contPares > 0) {
			mediaPares = somaPares / contPares;
			System.out.println("MEDIA DOS PARES = " + String.format("%.1f", mediaPares));
		} else {
			System.out.println("NENHUM NUMERO PAR");
		}
		
		sc.close();
	}
}
