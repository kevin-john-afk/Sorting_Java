// Subclass na nag-iinherit sa Account
package oop;

public class SavingsAccount extends Account {

    // Constructor ng SavingsAccount
    public SavingsAccount(String name, double balance) {
        super(name, balance);
    }

    // Polymorphism: override withdraw method
 
     void withdraw(double amount) {
        if (amount <= getBalance()) {
            setBalance(getBalance() - amount);
            System.out.println("Savings Account: Withdraw successful.");
        } else {
            System.out.println("Savings Account: Insufficient balance.");
        }
    }
}