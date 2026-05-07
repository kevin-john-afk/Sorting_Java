package abstraction1;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int balance = 1000;

        while (true) {
            System.out.println("\n---- BPI ATM ----");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose: ");

            int choice = sc.nextInt();
            ATM action = null;
        
            switch (choice) {
                case 1:
                    action = new Withdraw(balance);
                    break;

                case 2:
                    action = new depositt(balance);
                    break;

                case 3:
                    action = new checkBalance(balance);
                    break;

                case 4:
                    System.out.println("Thank you for using BPI ATM!");
                    return;

                default:
                    System.out.println("INVALID OPTION.");
                    continue;
            }

            // run the action (withdraw / deposit / check balance)
            action.atm();

            // update balance
            balance = action.getBalance();
        }
    }
}
