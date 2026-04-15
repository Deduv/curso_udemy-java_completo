package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Circle;
import model.entities.Rectangle;
import model.entities.Shape;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List <Shape> listShapes = new ArrayList<>();
		listShapes.add(new Rectangle(3.0, 2.0));
		listShapes.add(new Circle(2.0));
		
		List <Circle> listCircles = new ArrayList<>();
		listCircles.add(new Circle(3.0));
		listCircles.add(new Circle(5.0));
		
		System.out.println("Total area: " + String.format("%.2f", totalArea(listCircles)));
		
		sc.close();
	}

	private static double totalArea(List<? extends Shape> list) {
		double sum = 0.0;
		for (Shape s : list) {
			sum += s.area();
		}		
		return sum;
	}

}

//continuar daqui