package inheritance;
import java.util.Scanner;
public class coffee {
	Scanner sc = new Scanner(System.in);
	int amount;
	String c3;
	String c2;
	String c1;
	
    coffee( String c1,String c2,String c3){
    	this.c1 =c1;
    	this.c2 =c2;
    	this.c3 =c3;
    }
    

void checklist() {

    
	
	System.out.println("1. Matcha ");
	System.out.println("2. Spanish ");	
	System.out.println("3. Esprosso ");
	
	
	System.out.print("choose flavor: ");
	String choose =sc.nextLine();
	
switch(choose) {

  case "matcha":
	 amount =95;
	System.out.println("you chose: "+choose );
	break;

  case "spanish":
	 amount =85;
		System.out.println("you chose: " +choose);

		break;

  case "espresso":

	 amount =80;
		System.out.println("you chose: "+ choose);
		break;
	
  default:
    System.out.println("Invalid choice!");
    System.exit(0); 
}

System.out.println("Amount: " + amount);



}
}

