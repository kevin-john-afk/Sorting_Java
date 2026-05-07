package sige;

import java.util.Scanner;

public class Try {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		String name;
		int num;
		

	
		do {
			System.out.print("Enter your name");
			name  = scanner.nextLine();
		
		} while (name.isEmpty());
		
		  do {
			  System.out.print("numbers: ");
			  num  = scanner.nextInt();
		  } while (num < 0);
		  
		  int i = 1;
	      while (i <=num) {
			  
			  System.out.println(i + "." +name);
			  i++;
			  
	
			}
				
		}
		
	}


