package inheritance;

public class inheritance {

	public static void main(String[] args) {
		
coffee c = new coffee ("mactha", "espresso","spanish");
addons a = new addons ("sugar", "frappe","wheapcream");
receipt r = new receipt(); 






System.out.println("Welcome to coffee shop");

c.checklist();
a.addons();

r.reciept(a.addonsAmount, c.amount);

	}

}
