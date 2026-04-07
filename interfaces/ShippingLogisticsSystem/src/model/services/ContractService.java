package model.services;

import java.util.Calendar;
import java.util.Date;

import model.entitites.Contract;
import model.entitites.Installment;

public class ContractService {
	private OnlinePaymentService onlinePaymentService;
	
	public ContractService() {
		
	}
	
	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}

	public void processContract(Contract contract, Integer months) {
		double basicInstallmentValue = contract.getTotalValue() / months;
		double installmentWithInterest;
		double finalInstallmentValue;
		
		for (int i = 1; i <= months; i++) {
			installmentWithInterest = basicInstallmentValue + onlinePaymentService.interest(basicInstallmentValue, i);
			finalInstallmentValue = installmentWithInterest + onlinePaymentService.paymentFee(installmentWithInterest);
			Calendar cal = Calendar.getInstance();
			cal.setTime(contract.getDate());
			cal.add(Calendar.MONTH, i);
			Date dueDate = cal.getTime();
			Installment installment = new Installment(finalInstallmentValue, dueDate);
			contract.getInstallments().add(installment);
		}
		
	}
}
