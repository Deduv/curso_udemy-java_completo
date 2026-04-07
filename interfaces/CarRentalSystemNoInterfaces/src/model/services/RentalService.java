package model.services;

import model.entities.CarRental;
import model.entities.Invoice;

public class RentalService {
	
	private Double pricePerHour;
	private Double pricePerDay;
	
	private BrazilTaxService brazilTaxService;
	
	public RentalService(Double pricePerHour, Double pricePerDay, BrazilTaxService brazilTaxService) {
		this.pricePerHour = pricePerHour;
		this.pricePerDay = pricePerDay;
		this.brazilTaxService = brazilTaxService;
	}
	
	public void processInvoice (CarRental carRental) {
		long t1 = carRental.getStart().getTime();
		long t2 = carRental.getFinish().getTime();
		double hours = (double)(t2 - t1) / 1000.0 / 60.0 / 60.0;
		
		double basicPayment;
		if (hours <= 12.0) {
			basicPayment = pricePerHour * Math.ceil(hours);
		}
		else {
			basicPayment = pricePerDay * Math.ceil(hours / 24);
		}

		double tax = brazilTaxService.tax(basicPayment);
		
		carRental.setInvoice(new Invoice(basicPayment, tax));
	}

	public Double getPricePerHour() {
		return pricePerHour;
	}

	public void setPricePerHour(Double pricePerHour) {
		this.pricePerHour = pricePerHour;
	}

	public Double getPricePerDay() {
		return pricePerDay;
	}

	public void setPricePerDay(Double pricePerDay) {
		this.pricePerDay = pricePerDay;
	}

	public BrazilTaxService getBrazilTaxService() {
		return brazilTaxService;
	}

	public void setBrazilTaxService(BrazilTaxService brazilTaxService) {
		this.brazilTaxService = brazilTaxService;
	}
	
}
