package application;

import entities.Data;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Data d = new Data ();
		
		System.out.println("Enter rectangle width and height: ");
		d.width = sc.nextDouble();
		d.height = sc.nextDouble();
		
		System.out.println("AREA = " + String.format("%.2f", d.area()));
		System.out.println("PERIMETER = " + String.format("%.2f",d.perimeter()));
		System.out.println("DIAGONAL = " + String.format("%.2f",d.diagonal()));
		
		sc.close();
	}

}
