package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		int n = sc.nextInt();
		
		int countNegatives = 0;
		
		int [][] matrix = new int [n][n];
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = sc.nextInt();
				if (matrix [i][j] < 0) {
					countNegatives++;
				}
			}
		}
		
		System.out.println();
		
		System.out.println("Main diagonal: ");
		for (int i = 0; i < n; i++) {
			System.out.print(matrix [i][i] + " ");
		}
		
		System.out.println();
		System.out.println("Negatives numbers = " + countNegatives);
		
		sc.close();
	}

}
