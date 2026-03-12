package application;

import java.util.Scanner;
import java.util.Locale;

public class Triangle {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		double x1, x2, x3, area_x, y1, y2, y3, area_y, px, py;
		
		System.out.println("Enter the measures of triangle X: ");
		x1 = sc.nextDouble();
		x2 = sc.nextDouble();
		x3 = sc.nextDouble();
		
		System.out.println("Enter the measures of triangle Y: ");
		y1 = sc.nextDouble();
		y2 = sc.nextDouble();
		y3 = sc.nextDouble();
		
		px = (x1 + x2 + x3) / 2;
		area_x = Math.sqrt(px * (px - x1) * (px- x2) * (px - x3));
		
		System.out.println("Triangle X area: " + String.format("%.4f", area_x));
		
		py = (y1 + y2 + y3) / 2;
		area_y = Math.sqrt(py * (py - y1) * (py- y2) * (py - y3));
		
		System.out.println("Triangle Y area: " + String.format("%.4f", area_y));
		
		if (area_x > area_y) {
			System.out.println("Larger area: X");
		} else {
			System.out.println("Larger area: Y");
		}
		
		sc.close();
	}

}
