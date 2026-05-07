package oop;



// Parent class ng lahat ng account
public class Account {

    // Encapsulation: private variables
    private String accountName;
    private double balance;

    // Constructor para mag-initialize ng values
    public Account(String accountName, double balance) {
        this.accountName = accountName;
        this.balance = balance;
    }

    // Getter para sa account name
    public String getAccountName() {
        return accountName;
    }

    // Getter para sa balance
    public double getBalance() {
        return balance;
    }

    // Setter para baguhin ang balance
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Method para mag-deposit
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful: " + amount);
    }

    // Method para mag-withdraw (io-override ng subclasses)
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw successful: " + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}
