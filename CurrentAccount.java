package test;

public class CurrentAccount implements BankAcc{
	private String a= "Current Account";
	  
	  public void AccountType(){
	    System.out.println("It is a "+a);
	  }
	  public void checkBankBalance(){
	    System.out.println("The balance is Rs. 40000000");
	  }
	  public void validateUser(){
	    System.out.println("User is valid");
	  }
	  public void InvalidateUser(){
		    System.out.println("User is invalid");
		  }
	  


}
