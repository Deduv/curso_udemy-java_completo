/*Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
no 1o e 2o semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou
igual a 6.0 (seis).*/

package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Vetor;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos alunos serao digitados? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		Vetor [] vet = new Vetor [n];
		
		for (int i = 0; i < vet.length; i++) {
			System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + "º aluno: ");
	
			String nome = sc.nextLine();
			double n1 = sc.nextDouble();
			double n2 = sc.nextDouble();
			sc.nextLine();
			
			vet[i] = new Vetor (nome, n1, n2);
		}
		
		System.out.println("Alunos aprovados: ");
		for (int i = 0; i < vet.length; i++) {
			if (vet[i].getMedia() >= 6.0) {
				System.out.println(vet[i].getNome());
			}
		}
		
		sc.close();
	}
}
