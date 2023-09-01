package dsa_day11_BitwiseOperations;

import java.util.Scanner;

public class SetKthBit {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	      
	        int N = scanner.nextInt();
	        int K = scanner.nextInt();

	        
	        int mask = 1 << K;

	     
	        int result = N | mask;

	        
	        System.out.println(result);

	    
	        scanner.close();
	    }

}
