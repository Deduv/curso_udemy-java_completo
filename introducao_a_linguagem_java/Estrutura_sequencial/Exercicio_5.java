/*Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.*/

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		@SuppressWarnings("unused")
		int code1, number_piece1, code2, number_piece2;
		double value1, value2, pay;
		
		code1 = sc.nextInt(); 
		number_piece1 = sc.nextInt(); 
		value1 = sc.nextDouble();
		
		
		code2 = sc.nextInt(); 
		number_piece2 = sc.nextInt(); 
		value2 = sc.nextDouble();
		
		pay = (value1 * number_piece1) + (value2 * number_piece2);
		
		System.out.printf("\nVALOR A PAGAR = R$%.2f", pay);
		
		sc.close();
	}

}
