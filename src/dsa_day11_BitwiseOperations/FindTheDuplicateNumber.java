package dsa_day11_BitwiseOperations;

import java.util.Scanner;

public class FindTheDuplicateNumber {

	  public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int arr[] = new int[n+1];
	        
	        for (int i = 0; i <=n; i++) {
	            arr[i] = sc.nextInt();
	        }
	        
	        int val = 0;
	        boolean result = false;
	        
	        for (int i = 0; i <= n; i++) {
	            for (int j = i + 1; j <= n; j++) {
	                if (arr[i] == arr[j]) {
	                    val = arr[i];
	                    result = true;
	                    break; 
	                }
	            }
	            if (result) {
	                break; 
	            }
	        }
	        
	        System.out.println(val);
	    }

}

//Input (stdin)
//4
//1 3 4 2 2
//
//Output (stdout)
//2
