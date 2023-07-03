package day04;

import java.util.Scanner;

public class FindMaximumValue {

	public static void main(String[] args) {
		  Scanner name = new Scanner(System.in);
	      
	        int a = name.nextInt();
	        int b = name.nextInt();
	        int c = name.nextInt();
	        
	        int maxValue;
	        
	        if (a >= b && a >= c) {
	            maxValue = a;
	        } else if (b >= a && b >= c) {
	            maxValue = b;
	        } else {
	            maxValue = c;
	        }
	        
	        System.out.println(maxValue);

	}

}
