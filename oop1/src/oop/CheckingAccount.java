package oop;

// Subclass na nag-iinherit sa Account
public class CheckingAccount extends Account {

    // Service fee sa bawat withdraw
    private double serviceFee = 50;

    // Constructor ng CheckingAccount
    public CheckingAccount(String name, double balance) {
        super(name, balance);
    }

    // Polymorphism: override withdraw method
  
    public void withdraw(double amount) {
        double total = amount + serviceFee;

        if (total <= getBalance()) {
            setBalance(getBalance() - total);
            System.out.println("Checking Account: Withdraw successful.");
            System.out.println("Service Fee: " + serviceFee);
        } else {
            System.out.println("Checking Account: Insufficient balance.");
        }
    }
}
