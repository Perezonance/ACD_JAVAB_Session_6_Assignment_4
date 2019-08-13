package assignment_4;

public class BankATMException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public BankATMException(){
		super("ATM has Insufficient Funds");
	}

}
