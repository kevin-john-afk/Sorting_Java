import java.util.Scanner;
package cCCase;

public class jkjk {

	public static void main(String[] args) {
	
		 Scanner scanner = new Scanner(System.in);
	        String[] items = {"Chips", "Soda", "Chocolate", "Candy"};
	        double[] prices = {10.00, 15.00, 20.00, 5.00};
	        int choice;
	        double payment;

	        System.out.println("yo, welcum to da vendin machine!");

	        while (true) {
	            System.out.println("\nMAIN SCREEN");
	            System.out.println("[1] Pick yo stuff");
	            System.out.println("[2] Pay up and get spare cash (if u paid extra)");
	            System.out.println("[0] Get outta here");
	            System.out.print("What u wanna do? ");
	            choice = scanner.nextInt();

	            if (choice == 0) {
	                System.out.println("k thx bye!");
	                break;
	            } else if (choice == 1) {
	                System.out.println("\nSTUFF U CAN GET:");
	                for (int i = 0; i < items.length; i++) {
	                    System.out.println("[" + (i + 1) + "] " + items[i] + " - " + prices[i]);
	                }
	                System.out.print("Pick 1 thing (1-" + items.length + "): ");
	                int itemChoice = scanner.nextInt();

	                if (itemChoice < 1 || itemChoice > items.length) {
	                    System.out.println("Bruh, that's not on da list. Try again.");
	                } else {
	                    System.out.println("Aight, u picked: " + items[itemChoice - 1]);
	                    System.out.println("Dat costs: " + prices[itemChoice - 1]);
	                }
	            } else if (choice == 2) {
	                System.out.print("\nTell me wat u wanna buy (item number): ");
	                int itemChoice = scanner.nextInt();

	                if (itemChoice < 1 || itemChoice > items.length) {
	                    System.out.println("Man, u pickin wrong stuff. Back to menu.");
	                } else {
	                    double itemPrice = prices[itemChoice - 1];
	                    System.out.println("Aight, u want: " + items[itemChoice - 1]);
	                    System.out.println("It costs: " + itemPrice);
	                    System.out.print("Drop da cash: ");
	                    payment = scanner.nextDouble();

	                    if (payment < itemPrice) {
	                        System.out.println("Not enuff money, yo. Try again.");
	                    } else {
	                        double change = payment - itemPrice;
	                        System.out.println("Got da cash. Here’s yo stuff...");
	                        if (change > 0) {
	                            System.out.println("Take ur spare change: " + change);
	                        }
	                        System.out.println("Nice deal, thx!");
	                    }
	                }
	            } else {
	                System.out.println("Wut? Dat’s not a choice. Try again.");
	            }
	        }

	        scanner.close();
	    }
	}
		
	

	          
	      

	
		

