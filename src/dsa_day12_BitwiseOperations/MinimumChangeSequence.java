package dsa_day12_BitwiseOperations;

import java.util.Scanner;

public class MinimumChangeSequence {

	 public static String decimalToBinary(int num) {
			if (num == 0) {
				return "0";
			}

			if (num == 1) {
				return "1";
			}

			int remainder = num % 2;
			int quotient = num / 2;
			return decimalToBinary(quotient) + remainder;
		}
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int val = 1 << n;
	        for (int i = 0; i < val; i++) {
	            int takeValue = i ^ (i >> 1);
	            String result = decimalToBinary(takeValue);
	            while (result.length() < n) {
	                result = "0" + result;
	            }
	              
	            System.out.print(result + " ");
	        }
	    }

}

//Input (stdin)
//2
//
//Output (stdout)
//00 01 11 10
//
//
//Input (stdin)
//3
//
//Output (stdout)
//000 001 011 010 110 111 101 100
