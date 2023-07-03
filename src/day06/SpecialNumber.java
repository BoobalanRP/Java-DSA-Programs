package day06;


import java.util.Arrays;
import java.util.Scanner;

public class SpecialNumber {

	public static void main(String[] args) {

		 Scanner sc = new Scanner(System.in);
	        int m = sc.nextInt();
	        int n = sc.nextInt();
	        String org;
	        char number;
	        int value = 0;
	        int[] array;
	        int sum = 0;
	        int product = 1;
	        for (int i = m; i <= n; i++) {
	            org = Integer.toString(i);
	            array = new int[org.length()]; // Initialize the array with the size of org
	            for (int k = 0; k < org.length(); k++) {
	                number = org.charAt(k);
	                value = Character.getNumericValue(number);
	                array[k] = value; // Assign the value to the array element
	            }
	            for (int j = 0; j < array.length; j++) { // Remove the parentheses from array.length
	                sum += array[j];
	                product *= array[j];
	            }
	            Arrays.fill(array, 0); // Clear the array elements to 0
	            if ((sum + product) == i) {
	                System.out.println(i);
	            }
	            sum = 0; // Reset the sum to 0 for the next iteration
	            product = 1; // Reset the product to 1 for the next iteration
	        }
	    }
	}

//import java.util.*;
//
//class Main {
//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        int m = sc.nextInt();
//        int n = sc.nextInt();
//
//        for (int i = m; i <= n; i++) {
//            int sum = 0;
//            int product = 1;
//            int number = i;
//
//            while (number > 0) {
//                int digit = number % 10;
//                sum += digit;
//                product *= digit;
//                number /= 10;
//            }
//
//            if ((sum + product) == i) {
//                System.out.println(i);
//            }
//        }
//    }
//}

