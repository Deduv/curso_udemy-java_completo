/*Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".*/

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		double x1, x2, div;
		
		n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			x1 = sc.nextDouble();
			x2 = sc.nextDouble();
			
			if (x2 == 0) {
				System.out.println("Divisao impossivel");
			} else {
				div = x1 / x2;
				System.out.println(String.format("%.1f", div));
			}
		}	
		
		sc.close();
	}
}
