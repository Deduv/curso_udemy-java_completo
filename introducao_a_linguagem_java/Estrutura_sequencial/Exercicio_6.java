/*Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.*/

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a, b, c;
		double area_triangle, area_circle, area_trapezoid, area_square, area_rectangle;
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		area_triangle = (a * c) / 2.0;
		area_circle = Math.PI * Math.pow(c, 2.0);
		area_trapezoid = ((a + b) * c) / 2.0;
		area_square = Math.pow(b, 2.0);
		area_rectangle = a * b;
		
		System.out.println("\nTRIANGULO = " + String.format("%.3f", area_triangle));
		System.out.println("CIRCULO = " + String.format("%.3f", area_circle));
		System.out.println("TRAPEZIO = " + String.format("%.3f", area_trapezoid));
		System.out.println("QUADRADO = " + String.format("%.3f", area_square));
		System.out.println("RETANGULO = " + String.format("%.3f", area_rectangle));
		
		sc.close();
	}

}
