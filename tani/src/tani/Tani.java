package tani;
import java.util.Scanner;
public class Tani {

	public static void main(String[] args) {
		Scanner pa = new Scanner(System.in);
		
		
		double hours,pay;
		System.out.println("Enter your work hours per weeek: ");
		hours = pa.nextDouble();
		System.out.println("Enter your work hours per weeek: ");
		pay = pa.nextDouble();
		
		double regPay = 0,otPay = 0,grossPay = 0;
		
		if (hours <= 40) {
			regPay=hours*pay;
			otPay = 0;
		}else {
			otPay= (hours - 40) * pay*1.5;
			
			otPay = hours+pay;
			 }
		
		
		System.out.println("Your regular pay: " + regPay);
		System.out.println("Your overtime pay: " + otPay);
		System.out.println("Your gross pay: " + grossPay);


	}

}
