package entities;

public class AccontData {
	private int numberAccount;
	private String holder;
	private double balance;
	
	
	public AccontData(int numberAccount, String holder) {
		this.numberAccount = numberAccount;
		this.holder = holder;
	} 
	
	
	public AccontData(int numberAccount, String holder, double initialDeposit) {
		this.numberAccount = numberAccount;
		this.holder = holder;
		deposite(initialDeposit);
	} 

	
	public int getNumberAccont() {
		return numberAccount;
	}
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	public double getBalance() {
		return balance;
	}
	
	public void deposite (double amount) {
		balance += amount;
	}
	
	public void withdraw (double amount) {
		balance -= amount + 5.0;
	}
	
	public String toString() {
		return "Account: " + numberAccount + ", Holder: " + holder + ", Balance: $ " + String.format("%.2f", balance);
	}
	
}

 