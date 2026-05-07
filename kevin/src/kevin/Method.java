package kevin;

import java.util.*;

public class Method {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Enter 2 random strings");
        String string, string2;
        
        string = sc.nextLine();
        string2 = sc.nextLine();
        int result, finalResult = 0;
        
        if(string.compareTo(string2) < 0) {
            result = -1;
        }
        else if (string.compareTo(string2) > 0) {
            result = 1;
        }
        else {
            result = 0;
        }
        finalResult = string.compareTo(string2);
        
        System.out.println("Value Returned: "+ finalResult);
        System.out.print("Result is: "+ result);
        
    }

}