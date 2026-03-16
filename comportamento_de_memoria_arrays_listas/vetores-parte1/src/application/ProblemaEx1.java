/*Fazer um problema para ler um numero inteiro N e a altura de N pessoas. Armazene as N alturas em um vetor. Em seguida, mostrar a altura média
 * dessas pessoas. 
 */

package application;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaEx1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("HOW MANY HEIGHTS WILL BE DECLARED? ");
		int n = sc.nextInt();
		
		double [] vect = new double [n];
		
		double sum = 0.0, averageHeight = 0.0;
		
		for (int i = 0; i < n; i++) {
			System.out.print("Type the height: ");
			vect[i] = sc.nextDouble();
			sum += vect[i];
		}
		
		averageHeight = sum / (double) n;
		System.out.println("\nAVERAGE HEIGHT = " + String.format("%.2f", averageHeight));
	}

}
