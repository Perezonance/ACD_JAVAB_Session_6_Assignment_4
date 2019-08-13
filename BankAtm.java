package assignment_4;

public class BankAtm {
	private int atmID;
	private String bankName, location;
	private double balance;
	
	public BankAtm(int atmID, String name, String loc, double balance){
		this.atmID = atmID;
		this.bankName = name;
		this.location = loc;
		this.balance = balance;
	}
	
	public void withdraw(double amt)throws BankATMException{
		if(balance < 10000 || (balance - amt) < 0)
			throw new BankATMException();
		balance -= amt;
		System.out.println("$" + amt + " Withdrawn from the ATM.");
		
	}
	public void deposit(double amt){
		balance += amt;
		System.out.println("$" + amt + " Deposited into the ATM.");
	}
	
}
