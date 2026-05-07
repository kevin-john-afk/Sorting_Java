 package oop;

public class oop1 {
	String accountNumber;
	String accountholder;
    double balance;
	String accountType;
	
	oop1(String accnum, String acchol, String acctyp,double bal ){
		
		this.accountholder = acchol;
		this.accountNumber = accnum;
		this.accountType = acctyp;
		this.balance = bal;
	}
	void deposit(double amount) {
	    double limit = 0;

	    if (accountType.equalsIgnoreCase("Checking")) {
	        limit = 20000;
	    } else if (accountType.equalsIgnoreCase("Savings")) { 
	        limit = 8000;
	 } else if (accountType.equalsIgnoreCase("Current")) { 
	        limit = 30000;
  }

	    if (amount > limit) {
	        System.out.println("Too high " + accountType + " limit is $" + limit); 
	   } else {
	        balance += amount;
	        System.out.println("Deposited $" + amount);
	        System.out.println("New Balance: $" + balance);
  } 

        
        
        
    }
		
	
	void withdraw(double amount) {
	    double limit = 0;

	    if (accountType.equalsIgnoreCase("Checking")) {
       limit = 15000;
	   } else if (accountType.equalsIgnoreCase("Savings")) {
	        limit = 5000;
  } else if (accountType.equalsIgnoreCase("Current")) {
	        limit = 20000;
	    }

	    if (amount > limit) {
	        System.out.println("Too high! " + accountType + " withdrawal limit is $" + limit);   
	     } else if (amount > balance) {
	        System.out.println("Insufficient balance! Current balance: $" + balance); 
	  } else {
	     balance -= amount;
	        System.out.println("Withdrawn $" + amount); 
	        System.out.println("New Balance: $" + balance);
	    }
	}

		

	void checkbalance() {
		System.out.print("current balance: " +balance);
}
	public void closeAccount() {
	
		
	}}
