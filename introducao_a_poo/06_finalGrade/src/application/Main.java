package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Data;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Data d = new Data();
		
		d.name = sc.nextLine();
		d.g1 = sc.nextDouble();
		d.g2 = sc.nextDouble();
		d.g3 = sc.nextDouble();
		
		System.out.println("\nFINAL GRADE = " + String.format("%.2f", d.finalGrade()));
		
		if(d.finalGrade() < 60) {
			System.out.println("FAILED");
			System.out.println("MISSING " + String.format("%.2f", d.missingPoints()) + " POINTS");
		} else {
			System.out.println("PASS");
		}
		
		sc.close();
	}

}
