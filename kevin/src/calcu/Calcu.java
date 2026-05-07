package calcu;

import java.util.Scanner;


public class AnnualSalaryCalculator {

    public static void main(String[] args) {

        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter hourly rate: $");
        double hourlyRate = scanner.nextDouble();

        
        System.out.print("Enter number of hours worked per week: ");
        double hoursPerWeek = scanner.nextDouble();

     
        double annualSalary = calculateAnnualSalary(hourlyRate, hoursPerWeek);

    
        System.out.printf("Annual salary: $%.2f%n", annualSalary);

        
        scanner.close();
    }

   
  
    public static double calculateAnnualSalary(double hourlyRate, double hoursPerWeek) {
        
        int weeksPerYear = 52;

        
        return hourlyRate * hoursPerWeek * weeksPerYear;


	
		

	}

}
