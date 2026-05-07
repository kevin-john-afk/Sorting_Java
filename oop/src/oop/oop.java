package oop;
  
import java.util.Scanner;

public class oop {

	private static double amount;
	private static Object balance;

	public static void main(String[] args) {
    
		Scanner s = new Scanner(System.in);
		oop1 account1 = new oop1 ("201514026","Josie Rizal" ,"Savings", 5000);
		oop1 account2 = new oop1 ("202015472","John Dela Cruz", "Checking", 50000);
		oop1 account3 = new oop1("202451635", "Gabriella Silang", "Current", 1000000);
       
		

	

    System.out.print("Enter account number (or type CANCEL): ");
    String accNum = s.nextLine();

    if (accNum.equalsIgnoreCase("cancel")) {
        System.out.println(" cancelled.");
        return;
    }
	
	oop1 acc =null;
	
	if(accNum.equalsIgnoreCase(account1.accountNumber)) {
		acc = account1;
	}
	else if(accNum.equalsIgnoreCase(account2.accountNumber)) {
		acc = account2;
	}
	else if(accNum.equalsIgnoreCase(account3.accountNumber)) {
		acc = account3;
	}
	else {
		System.out.println("Account not found!");
    return;
	
   
	}	
	
	System.out.println("\nWelcome " + acc.accountholder + " (" + acc.accountType + " Account)");
	while(true) {
		
		
		
		System.out.println("1 deposit");
		System.out.println("2 withdrawal");
		System.out.println("3 check balance");
		System.out.println("4 close account");
		int choose = s.nextInt();
		
		if(choose == 1) {
			System.out.print("enter amount to deposit: ");
			int amount =s.nextInt();
			acc.deposit(amount);
		}
	else if (choose == 2) {
        System.out.print("Enter withdraw amount: ");
        double amount = s.nextDouble();
        acc.withdraw(amount);
    } else if (choose == 3) {
        acc.checkbalance();
   
    } else if (choose == 4) {
        System.out.println("👋 Thank you for banking with us!");
        break;
    } else {
        System.out.println("❌ Invalid choice!");
    }
	}}}


	
	

