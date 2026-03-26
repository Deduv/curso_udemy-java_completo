package entities;

public class IndividualAccountData extends AccountData{
	
	private double healthExpenditures;
	
	public IndividualAccountData() {
		super();
	}
	
	public IndividualAccountData(String name, double annualIncome, double healthExpenditures) {
		super(name, annualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}
	
	@Override
	public double taxPaid() {
		if (getAnnualIncome() < 20000.0) {
			return getAnnualIncome() * 0.15 - healthExpenditures * 0.5;
		}
		else {
			return getAnnualIncome() * 0.25 - healthExpenditures * 0.5;
		}

	}	
	
}
