package Airline;


import java.util.Scanner;
public class Airline {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	
	System.out.print("Enter the weight of the passanger: ");
	int weight =s.nextInt();
	
	 double charge = 0.0;
	
	if(weight<=50) {
		System.out.println("No charge");
		
	}else {
	double excessWeight = weight - 50;
    charge = 5.00 + (excessWeight * 0.95);
    System.out.printf("Baggage charge:"+ charge);
		
	}
	
	}

}
