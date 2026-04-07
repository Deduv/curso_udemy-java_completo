package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entitites.Contract;
import model.entitites.Installment;
import model.services.ContractService;
import model.services.PaypalService;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Entre os dados do contrato:");
		System.out.print("Numero: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("Data (dd/MM/yyyy): ");
		Date date = sdf.parse(sc.nextLine());
		System.out.print("Valor do contrato: ");
		double totalValue = sc.nextDouble();
		
		Contract contract = new Contract(number, date, totalValue);
		
		System.out.print("Entre com o numero de parcelas: ");
		int months = sc.nextInt();
		
		ContractService contractService = new ContractService(new PaypalService());
		contractService.processContract(contract, months);
		System.out.println("Parcelas: ");
		
		for (Installment installment : contract.getInstallments()) {
			System.out.println(sdf.format(installment.getDueDate()) + " - " + String.format("%.2f", installment.getAmount()));
		}
		
		
		sc.close();
	}

}
