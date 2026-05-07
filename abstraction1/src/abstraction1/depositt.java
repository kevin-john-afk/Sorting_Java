package abstraction1;
import java.util.Scanner;
public class depositt extends ATM{


	    public depositt(int balance) {
	        super(balance);
	    }

	    @Override
	    public void execute() {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("CURRENT BALANCE: P" + balance);
	        System.out.print("Enter amount to deposit: ");
	        double amount = sc.nextDouble();

	        balance += amount;
	        System.out.println("DEPOSIT SUCCESSFUL. NEW BALANCE: P" + balance);
	    }



}