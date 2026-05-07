package Trapezoid;
import java.util.Scanner;

public class Tcombi {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Input word with 5 letters: ");
        String word = sc.nextLine().toLowerCase();

        if (word.length() != 5) {
            System.out.println("Invalid input. Pleas put 5 letters only.");
            return;
        }

        System.out.println("combinations:");
 
        for (int a = 0; a < word.length(); a++) {
            for (int b = 0; b < word.length(); b++) {
                for (int c = 0; c < word.length(); c++) {
                    if (a != b && a != c && b != c) {
                        String combination =  "" + word.charAt(a) + word.charAt(b) + word.charAt(c);
                        System.out.println(combination);
                    }
                }
            }
        }
    }
}