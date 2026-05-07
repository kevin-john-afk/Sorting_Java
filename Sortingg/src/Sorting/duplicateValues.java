package Sorting;

public class duplicateValues {

	public static void main(String[] args) {
		int[] A = {2, 4, 4, 4, 4, 7, 9, 9, 12, 15};
	 int search = 4;

	   int low = 0;
	   int high = A.length - 1;
	  int index = -1;

	   while (low <= high) {
        int mid = (low + high) / 2;
	      if(A[mid] == search) {
	           index = mid;
	             break;   
	         }
	        else if (A[mid] < search) {
	            low = mid + 1;
	     }
	        else {
	         high = mid - 1;
	         
	       }
	      
	      
	   }

	   System.out.println("Index returned: " + index);


	   
	   
	}

}
