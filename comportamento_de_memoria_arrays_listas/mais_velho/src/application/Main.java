/*Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
da pessoa mais velha.*/

package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Vetor;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas voce vai digitar? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		Vetor vet[] = new Vetor [n];
		
		for (int i = 0; i < vet.length; i++) {
			System.out.println("Dados da " + (i + 1) + "ª pessoa: ");
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			sc.nextLine();
			
			vet[i] = new Vetor(nome, idade);
		}
		
		int maisvelho = vet[0].getIdade();
		int posicao = 0;
		
		System.out.print("\nPESSOA MAIS VELHA: ");
		
		for(int i = 1; i < vet.length; i++) {
			if (maisvelho < vet[i].getIdade()) {
				maisvelho = vet[i].getIdade();
				posicao = i;
			}
		}
		
		System.out.println(vet[posicao].getNome());
		
		sc.close();
	}

}
