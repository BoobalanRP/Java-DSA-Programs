package day18_Recursion;

import java.util.Scanner;

class NumMain {
	public static int NumberOfDigits(int val) {
		String val1 = val + "";

		return val1.length();
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num = NumberOfDigits(n);

		System.out.print("The number of digits in " + n + " is " + num);
	}
}

//Input (stdin)
//432
//
//Output (stdout)
//The number of digits in 432 is 3