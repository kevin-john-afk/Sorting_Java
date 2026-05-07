package Sorting;

public class smalldataset {

	public static void main(String[] args) {
		int[] A = {1, 3, 5, 7, 9, 11};
        int key = 9;

        int low = 0;
        int high = A.length - 1;
        int comparisons = 0;
        int index = -1;

        while (low <= high) {
          int mid = (low + high) / 2;
            
            comparisons++;
         if (A[mid] == key) {
             index = mid;
               break; 
           }
          else if (A[mid] < key) {
                low = mid + 1;
         }
           else {
              high = mid - 1;
          }
      
        }

      
        System.out.println("Index found at: " + index);
        System.out.println("Total comparisons: " + comparisons);
    }


	}


