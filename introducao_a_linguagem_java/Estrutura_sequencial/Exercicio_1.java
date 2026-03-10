/*Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
mensagem explicativa, conforme exemplos.*/

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x, y, sum;
		x = sc.nextInt();
		y = sc.nextInt();
		
		sum = x + y;
		
		System.out.println("SOMA = " + sum);
		
		sc.close();
	}

}
