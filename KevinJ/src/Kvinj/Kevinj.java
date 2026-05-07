package Kvinj;

import java.util.Scanner;

public class Kevinj {

	public static void main(String[] args) {
		   Scanner scanner = new Scanner(System.in);
	        int zero = 0;
	        int pos = 0;
	        int niggative = 0;
	        int count = 0;

	        System.out.println("Enter 10 integers:");

	        while (count < 10) {
	            System.out.print("Enter integer " + (count + 1) + ": ");
	            int number = scanner.nextInt();

	            if (number == 0) {
	                zero++;
	            } else if (number > 0) {
	                pos++;
	            } else {
	                niggative++;
	            }

	            count++;
	        }

	        System.out.println("zeros: " + zero);
	        System.out.println("positive integers: " + pos);
	        System.out.println("negative integers: " + niggative);

	        
	    }
	
	}


