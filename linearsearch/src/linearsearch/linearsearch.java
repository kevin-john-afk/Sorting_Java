package linearsearch;

public class linearsearch {

	public static void main(String[] args) {
		int [] asearch = {12, 7, 19, 7, 3, 7, 21, 7, 5,};
		int[] bsearch = {5, 11, 18, 2, 7, 9, 15, 1, 20};
		
		int value=2;
		int target =7;
		value(bsearch, value);
		LinearSearch(asearch, target);

	}
	public static void LinearSearch(int[] a, int target) {
		int comp =0;
		int first =-1;
		int last =-1;
		int multi =-1;
		int count =-1;
		for( int i=0; i< a.length; i++) {
			comp++;
			if(a[i] == target) {
				count++;
				if(first == -1) {
					first = i;
				}
				last=i;
				if(count ==2) {
					multi = i=1;
				}	
			}
		}
		System.out.println("-----Multiple Occurrences-----");
		System.out.println("Total number of comp: "+comp);
		System.out.println("index of foccurence: "+first);
		System.out.println("index of loccurence: "+last);
		System.out.println("multiple occurence iteration: "+ multi);
	}
	private static void value(int[] b, int value) {
		int comp = 0;
		int index= -1;
		  System.out.println("-----Early termination-----");
	    for (int i = 0; i < b.length; i++) {
	    
	    	  System.out.println("compare "+value+" to " + b[i]);
	        comp++;
	        
	        if (b[i] == value) {
	            index =i;
	            System.out.println("Value found at index: " + i);
	            System.out.println("");
	        break;
	}
	        
            System.out.println("Total comparisons made: " + comp);
	   
	    }
	    
	    
	 }
	
	}

