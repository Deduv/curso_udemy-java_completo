/*Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem
que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem
qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.
Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e
mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.*/

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_8 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salary, tax;
		salary = sc.nextDouble();
		
		if (salary <= 2000.0) {
			tax = 0.0;
		}
		else if (salary <= 3000.0) {
			tax = (salary - 2000.0) * 0.08;
		}
		else if (salary <= 4500.0) {
			tax = (salary - 3000.0) * 0.18 + 1000.0 * 0.08;
		}
		else {
			tax = (salary - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		}

		if (tax == 0.0) {
			System.out.println("Isento");
		}
		else {
			System.out.printf("R$ %.2f%n", tax);
		}
		
		sc.close();
	}	
}
