package test;

public class Run {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 CurrentAccount ca= new CurrentAccount();
		    SavingsAccount sa=new SavingsAccount();
		    ca.validateUser();
		    ca.InvalidateUser();
		    ca.AccountType();
		    ca.checkBankBalance();
		    sa.validateUser();
		    sa.InvalidateUser();
		    sa.AccountType();
		    sa.checkBankBalance();
		    

	}

}
