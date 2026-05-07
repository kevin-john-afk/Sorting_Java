package abstraction1;

public abstract class ATM {
    protected int balance;

    public ATM(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public abstract void execute();

	public void atm() {
		// TODO Auto-generated method stub
		
	}
}
