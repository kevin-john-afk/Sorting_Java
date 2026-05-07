package tutorials;


import java.util.Scanner;
public class Int {

	public static void main(String[] args) {
       int charge=0;
       double credits=0;
       double limit=0;
       double newBalance=0;
       int accMade=0;
  
	
		        Scanner scanner = new Scanner(System.in);
		        System.out.println("Emter account number (-1 to end): ");
		    	   int num1=scanner.nextInt();
		       while (true) {
		    	   
		    	   
		    	  
		    	   System.out.println("Emter beginning balance:  ");
		    	  double balance=scanner.nextDouble();
		    	   
		    	   System.out.println("Emter total charge:  ");
		    	   double num3 =scanner.nextDouble();
		    	   System.out.println("Enter total credits: ");
		    	   double num4 = scanner.nextDouble();
		    	   System.out.println("Enter credit limit: ");
		    	   double num5 = scanner.nextDouble();
		    	   
		    	   newBalance = balance+num3-num4;
		    	    System.out.println("New balance: "+newBalance);
		    	    if(newBalance > num5) {
		    	    System.out.println("Account: "+num1);
		    	    System.out.println("Credit limit: "+num4);
		    	    System.out.println("balance: "+newBalance);
		    	    
		    	    }
		    	    System.out.println("Emter account number (-1 to end): ");
			    	   int num11=scanner.nextInt();
			    	   return;

		    	  
		       }
		      
		    }
		
	}


