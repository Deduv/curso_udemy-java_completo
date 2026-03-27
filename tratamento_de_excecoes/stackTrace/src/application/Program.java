package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		method1();
		method2();

		System.out.println("End of program");

	}
	public static void method1() {
		System.out.println("*******METHOD1 START*********");
		method2();
		System.out.println("*******METHOD1 END*********");
	}
	public static void method2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("*******METHOD2 START*********");
		
	
		String[] vect = sc.nextLine().split(" ");
		int position = sc.nextInt();
		System.out.println(vect[position]);
		
		
		System.out.println("*******METHOD2 END*********");
		sc.close();
	}

}



