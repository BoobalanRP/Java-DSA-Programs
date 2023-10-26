package freshwork_interview;

import java.util.Scanner;
//Write a program to print digits of a number from Most significant digit to least using recursion.
//Get a number from the user and print it's digits from MSD to LSD. Digits will be separated by a newline.
//Sample Input:
//123
//Sample Output:
//1
//2
//3
public class MostSignificantDigitToLeastUsingRecursion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		  int num = sc.nextInt();
		  printNumber(num);
	    
	  }
		public static void printNumber(int num){
			if(num/10 >0){
				printNumber(num/10);
			}
			System.out.println(num%10);
		}
	

	}


