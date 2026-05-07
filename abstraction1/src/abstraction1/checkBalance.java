package abstraction1;

public class checkBalance extends ATM{


	    public checkBalance(int balance) {
	        super(balance);
	    }

	    @Override
	    public void execute() {
	        System.out.println("YOUR BALANCE: P" + balance);
	    }
	}


