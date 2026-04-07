package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.CarRental;
import model.entities.Vehicle;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter dtf =  DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.println("Entre com os dados do aluguel");
		System.out.print("Modelo do carro: ");
		String model = sc.nextLine();
		System.out.print("Retirada (dd/MM/yyyy hh:mm): ");
		LocalDateTime start = LocalDateTime.parse(sc.nextLine(), dtf);
		System.out.print("Retorno (dd/MM/yyyy hh:mm): ");
		LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), dtf);
		
		CarRental cr = new CarRental(start, finish, new Vehicle(model));
		
		
		System.out.print("Entre com o preço por hora: ");
		System.out.print("Entre com o preço por dia: ");
		
		
		
		
		
		
		System.out.println("FATURA: ");
		System.out.print("Pagamento basico: ");
		System.out.print("Imposto: ");
		System.out.print("Pagamento total: ");
		
		sc.close();
	}

}
