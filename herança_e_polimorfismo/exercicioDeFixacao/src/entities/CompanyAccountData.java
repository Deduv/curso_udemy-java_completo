package entities;

public class CompanyAccountData extends AccountData {
	
	private int numberOfEmployees;
	
	public CompanyAccountData() {
		super();
	}
	
	public CompanyAccountData(String name, double annualIncome, int numberOfEmployees) {
		super(name, annualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}
	
	@Override
	public double taxPaid() {
		if (getNumberOfEmployees() > 10) {
			return super.getAnnualIncome() * 0.14;
		} else {
			return super.getAnnualIncome() * 0.16;
		}
	}

}
