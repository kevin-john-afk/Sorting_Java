package oop1;

public class product {
   
	// class
	String name;
    float price;
    // constructor
    product(String name,float price){
    	this.name = name;
    	this.price = price;
    	
    System.out.println(name + " has been Creates");
    System.out.println("php: " + price);
	}
}
