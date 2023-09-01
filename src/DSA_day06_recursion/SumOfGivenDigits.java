package dsa_day06_recursion;

import java.util.Scanner;

public class SumOfGivenDigits {

	public static int SumOfDigits(int num) {
		if (num == 0) {
			return 0;
		} else {
			int reminder = num % 10;
			int quotient = num / 10;
			return reminder + SumOfDigits(quotient);
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int val = SumOfDigits(num);
		System.out.println("The sum of digits in " + num + " is " + val);
	}

}

//Input (stdin)
//432
//
//Output (stdout)
//The sum of digits in 432 is 9
