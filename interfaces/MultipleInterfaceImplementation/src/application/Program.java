package application;

import java.util.Locale;
import java.util.Scanner;

import model.devices.ComboDevice;
import model.devices.ConcretePrinter;
import model.devices.ConcreteScanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		ConcretePrinter p1 = new ConcretePrinter("1080");
		p1.processDoc("My letter");
		p1.print("My letter");
		
		System.out.println();
		
		ConcreteScanner p2 = new ConcreteScanner("2003");
		p2.processDoc("My Email");
		System.out.println("Scan result: " + p2.scan());
		
		System.out.println();
		
		ComboDevice p3 = new ComboDevice("2081");
		p3.processDoc("My dissertation");
		p3.print("My dissertation");
		System.out.println("Scan result: " + p3.scan());
		
		sc.close();
	}

}
