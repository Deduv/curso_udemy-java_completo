package entities;

public class AccontData {
	private int number;
	private String holder;
	private double balance;
	
	public AccontData (int number, String holder) {
		this.number = number;
		this.holder = holder;
	}
	
	public AccontData(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}

	public int getnumber() {
		return number;
	}
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	public double getDepositeValue() {
		return balance;
	}
		
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount + 5.0;
	}
	
	public String toString () {
		return "Accont " + this.number + ", " + "Holder: " + this.holder + ", Balance: $" + String.format("%.2f", this.balance);
	}

}
