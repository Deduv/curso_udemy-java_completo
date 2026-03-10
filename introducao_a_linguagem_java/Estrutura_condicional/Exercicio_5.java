/*Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
seguir, calcule e mostre o valor da conta a pagar.*/

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int code, quantity;
		double price, pay;
		
		code = sc.nextInt();
		quantity = sc.nextInt();
		
		switch (code) {
			case 1:
			price = 4.00;
			break;
			case 2:
			price = 4.50;
			break;
			case 3:
			price = 5.00;
			break;
			case 4:
			price = 2.00;
			break;
		default:
			System.out.println("CODIGO INVALIDO");
			sc.close();
			return;
		}
		
		pay = price * quantity;
		
		System.out.println("\nTotal: R$" + String.format("%.2f", pay));
		
		sc.close();
	}
}
