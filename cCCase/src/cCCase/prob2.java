package cCCase;
import java.util.Scanner;


public class prob2 {

	public static void main(String[] args) {
	
	
	  
		int Apple = 200;
		int Grapes = 350;
		int Banana = 150;
		  int pin = 1000;
	  
	Scanner in = new Scanner(System.in);
	
	
	System.out.print("Choose Item: ");  
	String kev = in.nextLine();
	
	System.out.print("payment: ");  
	int vek = in.nextInt();
	
	
	
    if(kev.equalsIgnoreCase("Apple")) {
    	vek = Apple -pin;
    	
  }if(kev.equalsIgnoreCase("Banana")) {
  	vek = Banana -pin;
	
}
  if(kev.equalsIgnoreCase("Grapes")) {
  	vek = Grapes -pin;
  	
}


  System.out.println("Change: " + vek);


	
	}
}
