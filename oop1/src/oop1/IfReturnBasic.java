package oop1;

public class IfReturnBasic {

    // Method to check if a number is positive or negative
	
    public static String checkNumber(int num) {
        if (num >= 18) {
            return "can vote";   // if true
        } else {
            return "can not vote";   // if false
        }
    }

    static void main(String[] args) {
        System.out.println(checkNumber(200));   // Positive number
        System.out.println(checkNumber(17));   // Negative number
    }
}
