package entities;

public class account {
	private String name;
	private int accNumber;
	private double balance;
	
	public account(String name, int accNumber, double initialDeposit) {
		this.name = name;
		this.accNumber = accNumber;
		deposit(initialDeposit);
	}
	
	public account(String name, int accNumber) {
		this.name = name;
		this.accNumber = accNumber;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAccNumber() {
		return accNumber;
	}

	public double getBalance() {
		return balance;
	}
		
	public void deposit(double value) {
		this.balance += value;
	}
	public void withdraw(double value) {
		this.balance -= value+5;
	}
	
	
	
}
