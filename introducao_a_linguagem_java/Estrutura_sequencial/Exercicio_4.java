/*Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
decimais.*/

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int number, worked_hours;
		double value_per_hour, salary;
		
		number = sc.nextInt();
		worked_hours = sc.nextInt();
		value_per_hour = sc.nextDouble();
		
		salary = worked_hours * value_per_hour;
		
		System.out.println("NUMBER = " + number);
		System.out.printf("SALARY = U$ %.2f", salary);
		
		sc.close();
	}

}
