package day20_Exception;

import java.util.Scanner;

public class DigitExceptionHandlingJava {

	   public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int start = sc.nextInt();
	        int end = sc.nextInt();
	        int count = 0;

	        for (int i = start; i <= end; i++) {
	            if (areAllDigitsLessThanFive(i)) {
	                count++;
	            }
	        }

	        System.out.println(count);
	    }

	    public static boolean areAllDigitsLessThanFive(int number) {
	        while (number > 0) {
	            int digit = number % 10;
	            if (digit >= 5) {
	                return false;
	            }
	            number /= 10;
	        }
	        return true;
	    }

}


//Input (stdin)
//1 4300
//
//Output (stdout)
//575