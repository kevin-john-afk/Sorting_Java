package Bubblesort;

import java.util.Scanner;

public class SortMethods {
    
    
    public static void sortData(String[] data) {
        int len = data.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if (data[j].compareTo(data[j + 1]) > 0) {
                    String temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
            }
          }
        }
    }
    
    
    public static void sortData(int[] data) {
        int len = data.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if (data[j] > data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
     }
     }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("How many elements do you want to sort? ");
        int size = in.nextInt();

        System.out.print("Choose type: (1) Numbers  (2) Words: ");
        int choice = in.nextInt();

        switch (choice) {
            case 1:
                int[] numArr = new int[size];
                for (int i = 0; i < size; i++) {
                    System.out.print("Enter number : ");
                    numArr[i] = in.nextInt();
                }

                sortData(numArr);

                System.out.println("Sorted numbers:");
                for (int n : numArr) {
                    System.out.print(n + " ");
                }
                break;

            case 2:
                String[] wordArr = new String[size];
                for (int i = 0; i < size; i++) {
                    System.out.print("Enter word   : ");
                    wordArr[i] = in.next();
                  
                }

                sortData(wordArr);

                System.out.println("\nSorted words:");
                for (String w : wordArr) {
                    System.out.print(w + " ");
                }
                break;

            default:
                System.out.println("Invalid option. Please restart and try again.");
        }
    }
}
