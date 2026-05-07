package Sorting;

public class binarySearch {
	int [] A = {3, 8, 15, 21, 29, 34, 55, 89, 144, 233, 377};
	int target =34;
		
	 voidbinarySearch() {

	int index = binarysearch(A, target);
	if(index == -1) {
		System.out.print(target+" not found");
	}
	else {
		System.out.println("element found at: "+index);
		
	}
	        }
		public static int binarysearch(int [] A, int target) {
			int comp= 0;
			int low = 0;
			int high =A. length -1;
		
			while(low <= high) {
				comp++;
				int middle = low+(high-low) /2;
				int value  = A[middle];
				System.out.println("middle: "+value);
				
				if(value < target) {
					low = middle +1;
				}
				else if(value > target) {
					high = middle -1;
					
				}
				else {
					System.out.println("Total comparison: "+comp);
					 return middle;
				}
			}
			
			
			return -1;
		
		}

		}



