/*Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).*/

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_2_while {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double x, y;
		
		x = sc.nextDouble();
		y = sc.nextDouble();
		
		while (x != 0 && y != 0) {
		
			if (x > 0 && y > 0) {
				System.out.println("Primeiro");
			} else if (x > 0 && y < 0) {
				System.out.println("Quarto");
			} else if (y > 0 && x < 0) {
				System.out.println("Segundo");
			} else {
				System.out.println("Terceiro");
			} 
			
			x = sc.nextDouble();
			y = sc.nextDouble();
		}
		
		sc.close();
	}
}
