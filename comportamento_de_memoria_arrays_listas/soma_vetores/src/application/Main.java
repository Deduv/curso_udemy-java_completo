package application;

import java.util.Locale;
import java.util.Scanner;
import entities.SomaVet;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos valores vai ter cada vetor? ");
		int n = sc.nextInt();
		
		SomaVet [] vectA = new SomaVet[n];
		SomaVet [] vectB = new SomaVet[n];
		SomaVet [] vectC = new SomaVet[n];
		
		System.out.println("Digite os valores do vetor A: ");
		for (int i = 0; i < vectA.length; i++) {
			int numA = sc.nextInt();
			vectA[i] = new SomaVet(numA);
		}
		
		System.out.println("Digite os valores do vetor B: ");
		for (int i = 0; i < vectB.length; i++) {
			int numB = sc.nextInt();
			vectB[i] = new SomaVet(numB);
		}
		
		System.out.println("VETOR RESULTANTE: ");
		for (int i = 0; i < vectC.length; i++) {
			int soma = vectA[i].getNum() + vectB[i].getNum();
			vectC[i] = new SomaVet(soma);
			System.out.println(vectC[i].getNum());
		}
		
		sc.close();
	}

}
