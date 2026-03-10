/*Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.*/

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int start, end, duration;
		
		start = sc.nextInt();
		end = sc.nextInt();
		
		if (start < end) {
			duration = end - start;
		} else {
			duration = 24 - start + end;
		}
		
		System.out.println("O JOGO DUROU = " + duration + " HORAS");
		
		sc.close();
	}
}
