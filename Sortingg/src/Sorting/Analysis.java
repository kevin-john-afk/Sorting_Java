package Sorting;

public class Analysis {

	public static void main(String[] args) {
	
	int[] A = {42, 17, 8, 99, 23, 54, 31};

	 int comparisons = 0;

	 System.out.println(" Array:");
		for (int i = 0; i < A.length; i++) {
		            System.out.print(A[i] + " ");
		     }
		 System.out.println("\n");

		 for (int i = 0; i < A.length - 1; i++) {
         int min = i;
		   for (int j = i + 1; j < A.length; j++) {
                  comparisons++;
		                if (A[j] < A[min]) {
		                    min = j;
		                }
		            }
               int temp = A[i];
		            A[i] = A[min];
		            A[min] = temp;

		            System.out.print("Pass " + (i+1) + ": ");
		            for (int k = 0; k < A.length; k++) {
		                System.out.print(A[k] + " ");
		            }
		            System.out.println();
		        }

		        System.out.println("Sorted Array:");
		        for (int i = 0; i < A.length; i++) {
		            System.out.print(A[i] + " ");

		        }
		            

		        System.out.println("Total Comparisons: " + comparisons);
		    }
	
	}


