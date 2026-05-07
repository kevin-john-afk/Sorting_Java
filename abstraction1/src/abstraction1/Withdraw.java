package abstraction1;

import java.util.Scanner;

public class Withdraw extends ATM {

    public Withdraw(int balance) {
        super(balance);
    }

    @Override
    public void execute() {
        Scanner sc = new Scanner(System.in);

        System.out.println("CURRENT BALANCE: P" + balance);
        System.out.print("Enter amount to withdraw: ");
        double amount = sc.nextDouble();

        if (amount > balance) {
            System.out.println("INSUFFICIENT FUNDS.");
        } else {
            balance -= amount;
            System.out.println("WITHDRAW SUCCESSFUL. NEW BALANCE: P" + balance);
        }
    }
}
