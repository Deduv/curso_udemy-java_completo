package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Triangle_POO;

public class TrianglePOO {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		Triangle_POO x, y;
		x = new Triangle_POO();
		y = new Triangle_POO();
		
		System.out.println("Enter the measures of triangle X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Enter the measures of triangle Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double px = (x.a + x.b + x.c) / 2;
		double area_x = Math.sqrt(px * (px - x.a) * (px- x.b) * (px - x.c));
		
		System.out.println("Triangle X area: " + String.format("%.4f", area_x));
		
		double py = (y.a + y.b + y.c) / 2;
		double area_y = Math.sqrt(py * (py - y.b) * (py- y.b) * (py - y.c));
		
		System.out.println("Triangle Y area: " + String.format("%.4f", area_y));
		
		if (area_x > area_y) {
			System.out.println("Larger area: X");
		} else {
			System.out.println("Larger area: Y");
		}
		
		sc.close();
	}

}
