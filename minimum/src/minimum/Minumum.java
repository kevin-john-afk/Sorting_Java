package minimum;

public class Minumum {

	public static void main(String[] args) {
		int [] asearch = {23, 4, 15, 8, 42,16, 1, 30, 2,};
		
		
		int min= asearch[0];
		int comp= 0;
		int index =0;
		int update =0;
		
		for( int i = 0; i< asearch.length; i++) {
			comp++;
			if(asearch[i] < min) {
				update++;
				min =asearch[i];
				index =i;
			}
			System.out.println("min after iteration "+i+":"+min);
		}
		System.out.println("Value of min after each iteration: "+min);
		System.out.println("Total number of comparison: "+comp);
		System.out.println("Number of time min was update: "+update);
		System.out.println("Index of final minimum value: "+index);
		

	}

}
