package test;

public class SavingsAccount implements 	BankAcc{
	private String b= "Savings Account";
	  public void AccountType(){
	    System.out.println("It is a "+b);
	    
	  }
	  public void checkBankBalance(){
	    System.out.println("The balance is Rs.10000");
	  }
	  public void validateUser(){
	    System.out.println("User is valid");
	  }
	  public void InvalidateUser(){
		    System.out.println("User is invalid");
		  }

}
