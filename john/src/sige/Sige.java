package sige;
 
import java.util.Scanner;

public class Sige {

	public static void main(String[] args) {
		
		int math;
		int science;
		int computer;
		int english;
		
		Scanner kev = new Scanner(System.in);
		
		System.out.println("Enter math: ");
		math = kev.nextInt();
		System.out.println("Enter science: ");
		science = kev.nextInt();
		System.out.println("Enter computer: ");
		computer = kev.nextInt();
		System.out.println("Enter english: ");
		english = kev.nextInt();
		
		int average = (math+science+computer+english)/4;
		System.out.println("Enter average:  "+average);
		
		if(average>=100) 
		   System.out.print("Invalid");
		if(average>=98)
		System.out.print("With higest honors");
		else if(average>=95)
		System.out.print("With high honors");
		else if(average>=91)
		System.out.print("with honors");
		else if(average>=89)
		System.out.print("passed");
		else 
			System.out.print("Failed");
		}
			
	}

 
		
		

	