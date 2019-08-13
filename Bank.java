package assignment_4;

public class Bank {
	public static void main(String[] args) {
		BankAtm atm1 = new BankAtm(1001, "Chase", "Alpharetta, GA", 20000);
		BankAtm atm2 = new BankAtm(2001, "Wellsfargo", "Snellville, GA", 30000);
		BankAtm atm3 = new BankAtm(1002, "Chase", "Alpharetta, GA", 15000);
		
		atm1.deposit(5000);
		try {
			atm3.withdraw(7000);
		} catch (BankATMException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			atm2.withdraw(35000);
		} catch (BankATMException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			atm3.withdraw(1000);
		} catch (BankATMException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
