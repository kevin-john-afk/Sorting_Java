package practice;
import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
Scanner sc = new Scanner (System.in);
        
        int num [] = new int [5];
        int nums [] = new int [5];
        
        System.out.println("Enter 5 integers: "); 
        for(int i = 0; i < num.length; i++){
            num[i] = sc.nextInt();
        }
        System.out.println("Enter 5 integers: "); 
        for(int i = 0; i < nums.length; i++){
             nums[i] = sc.nextInt(); 
        }
        
        int sum [] = new int [5];
        
        System.out.println("Sum Array: ");
        for(int i = 0; i < sum.length; i++){
            sum[i] = num[i] + nums[i];
            System.out.print(sum[i]+ " ");
        }
        System.out.println("");
        
        int choice = 0;
        int temp = 0, k;
        System.out.println("1. Ascending");
        System.out.println("2. Descending");
        System.out.println("");
        
        choice = sc.nextInt();
        if(choice == 1){
            for(int i = 0; i < sum.length - 1; i++){
                k = i;
                for(int j = i+1; j < sum.length; j++){
                    if(sum[j] < sum[k]){
                        k=j;
                        temp = sum[i];
                        sum[i] = sum[k];
                        sum[k] = temp;
                    }
                }
            }
                for(int i = 0; i < sum.length; i++){
                System.out.print(sum[i]+ " ");
                }
        }
        else if(choice == 2){
            for(int i = 0; i < sum.length - 1; i++){
                k = i;
                for(int j = i+1; j < sum.length; j++){
                    if(sum[j] > sum[k]){
                        k=j;
                        temp = sum[i];
                        sum[i] = sum[k];
                        sum[k] = temp;
                    }
                }
            }
                for(int i = 0; i < sum.length; i++){
                System.out.print(sum[i]+ " ");
                }
        }

    }
    


	}


