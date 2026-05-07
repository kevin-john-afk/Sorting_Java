package sorting;

import java.util.Scanner;

public class PatarayLab4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Pick a number:");
        int s = sc.nextInt();

        int[] array = new int[s];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter value " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }

        System.out.println("Select 1 for Selection Sort");
        System.out.println("Select 2 for Insertion Sort");

        int choose = sc.nextInt();

        switch (choose) {
            case 1:
                SelectionSort(array);
                break;
            case 2:
                insertionSort(array);
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }

    private static void SelectionSort(int arr[]) {
        int m = arr.length;

        System.out.print("Initial: ");
        for (int i = 0; i < m; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < m; i++) {
            int minimum = i;

            for (int j = i + 1; j < m; j++) {
                if (arr[j] < arr[minimum]) {
                    minimum = j;
                }
            }

            int temp = arr[minimum];
            arr[minimum] = arr[i];
            arr[i] = temp;

            System.out.print("Pass " + (i + 1) + ": ");
            for (int k : arr) {
                System.out.print(k + " ");
            }
            System.out.println();
        }

        System.out.print("Final: ");
        for (int i = 0; i < m; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private static void insertionSort(int arr[]) {
        int m = arr.length;

        System.out.print("Initial: ");
        for (int i = 0; i < m; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < m; i++) {
            int temp = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = temp;

            System.out.print("Pass " + (i + 1) + ": ");
            for (int k : arr) {
                System.out.print(k + " ");
            }
            System.out.println();
        }

        System.out.print("Final Pass: ");
        for (int i = 0; i < m; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}