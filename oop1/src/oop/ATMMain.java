package oop;

import java.util.Scanner;



public class ATMMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Gumagawa ng account objects
        Account savings = new SavingsAccount("Juan", 5000);
        Account checking = new CheckingAccount("Pedro", 3000);

        int choice;

        do {
            // Simple menu ng ATM
            System.out.println("\n=== ATM MENU ===");
            System.out.println("1. View Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    // Ipinapakita ang balanse ng accounts
                    System.out.println("Savings Balance: " + savings.getBalance());
                    System.out.println("Checking Balance: " + checking.getBalance());
                    break;

                case 2:
                    // Deposit sa savings account
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    savings.deposit(depositAmount);
                    break;

                case 3:
                    // Withdraw sa checking account
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    checking.withdraw(withdrawAmount);
                    break;

                case 4:
                    // Pag-exit ng program
                    System.out.println("Thank you for using the ATM.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);

        sc.close();
    }
}
