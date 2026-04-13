package model.services;

public class UsalInterestService implements InterestService {
	
	private double interestRate;
	
	public UsalInterestService() {
		
	}

	public UsalInterestService(double interestRate) {
		this.interestRate = interestRate;
	}
	
	@Override
	public double getInterestRate() {
		return interestRate;
	}
	
	
}
