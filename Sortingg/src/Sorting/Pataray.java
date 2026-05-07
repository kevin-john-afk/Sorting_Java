package Sorting;

public class Pataray {

	public static void main(String[] args) {
	
		System.out.println("-----Part 1 Linear Search-----");
		linearSearch ls = new linearSearch();
		ls.linearsearch();
	
		System.out.println("---Part 2 finding the minimum---");
	minimum min =  new minimum();
	min.minimum();
	
	System.out.println("---Part 3: Binary Search---");
	binarySearch bs = new binarySearch();
	
	bs.binarySearch();


   
    }
}
