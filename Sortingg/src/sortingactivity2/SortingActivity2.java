package sortingactivity2;
import java.util.Scanner;
public class SortingActivity2 {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input array length: ");
        int size = sc.nextInt();
        int[] array = new int[size];

        for(int i = 0; i < array.length; i++){
            System.out.print("Enter number " +(i+1)+ ": ");
            array[i] = sc.nextInt();
        }
        System.out.println("");

        System.out.println("choose option");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Merge Sort");
        int choice = sc.nextInt();

        switch(choice) {
            case 1:
                bubbleSort(array);
                break;
            case 2:
                mergeSort(array);
                System.out.println("Final");
                for(int k : array) {
                    System.out.print(k + " ");
                }
                break;
            default:
                return;
        }
    }

    private static void bubbleSort(int array[]) {
        int size = array.length;

        System.out.print("Initial: ");
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        for(int i = 0; i < size - 1; i++) {
            for(int j = 0; j < size - i - 1; j++) {
                if(array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        System.out.print("Sorted: ");
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private static void mergeSort(int array[]) {
        mergeSortRecursive(array, 0, array.length - 1);
    }

    private static void mergeSortRecursive(int array[], int left, int right) {
        if(left < right) {
            int mid = (left + right) / 2;
            mergeSortRecursive(array, left, mid);
            mergeSortRecursive(array, mid + 1, right);
            merge(array, left, mid, right);
        }
    }

    private static void merge(int array[], int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        for(int i = 0; i < n1; i++) {
            leftArray[i] = array[left + i];
        }
        for(int j = 0; j < n2; j++) {
            rightArray[j] = array[mid + 1 + j];
        }

        int i = 0, j = 0, k = left;
        while(i < n1 && j < n2) {
            if(leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while(i < n1) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        while(j < n2) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }
}