package entities;

public class CurrencyConverter {
		
	public static double IOF = 0.06;
		
	public static double convert (double price, double amount) {
		return price * amount * (1 + IOF);
	}
	
}
