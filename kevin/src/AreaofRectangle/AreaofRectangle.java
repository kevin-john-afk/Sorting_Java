package AreaofRectangle;
  
import java.util.Scanner;

public class AreaofRectangle {

	
	

public static void main(String[] args) {
	

	    
	Scanner scanner = new Scanner(System.in);

    double regularPay; 
    double netPay; 
    double grossPay;
    double overtimePay = 0, tax=0;

    System.out.print("Enter the employee's pay rate: ");
    double payRate = scanner.nextDouble();
    System.out.print("Enter the hours worked: ");
    double hoursWorked = scanner.nextDouble();
    scanner.nextLine();
    System.out.print("Enter the employee code (A for full-time, B for part-time): ");
    String employeecode = scanner.nextLine();
    System.out.print("Enter the state code (Y for New York, J for New Jersey): ");
    String statecode = scanner.nextLine();
    
    if (hoursWorked <= 40) {
        regularPay = payRate * hoursWorked;
    } else {
        regularPay = payRate * 40; 
        overtimePay = (payRate * 1.5) * (hoursWorked - 40); 
    }

    grossPay = regularPay + overtimePay;

    
    if (employeecode == "A" 
    		|| employeecode == "a") {
        if (statecode == "Y" 
        		|| statecode == "y") {
            tax = grossPay * 0.07;
        } else {
            tax = grossPay * 0.045;
        }
    }

   
    netPay = grossPay - tax;


    System.out.println("Regular Pay: " + regularPay);
    System.out.println("Overtime Pay: " + overtimePay);
    System.out.println("Gross Pay: " + grossPay);
    System.out.println("Tax: " + tax);
    System.out.println("Net Pay: " + netPay);

    
	}

}
