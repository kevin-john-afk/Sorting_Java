package loop;
import java.util.Scanner;
public class niggas {
	 Scanner scanner = new Scanner(System.in);

     // Ask the user to input the number of rows (height of the pyramid)
     System.out.print("Enter the number of rows for the pyramid: ");
     int n = scanner.nextInt();

     // Outer loop for the rows of the pyramid
     for (int i = 1; i <= n; i++) {
         // Inner loop for spaces before the stars
         for (int j = i; j < n; j++) {
             System.out.print(" "); // Printing spaces
         }

         // Inner loop for printing the stars
         for (int k = 1; k <= (2 * i - 1); k++) {
             System.out.print("*"); // Printing stars
         }

         // Move to the next line after each row
         System.out.println();
     }

     scanner.close();
 }
}
