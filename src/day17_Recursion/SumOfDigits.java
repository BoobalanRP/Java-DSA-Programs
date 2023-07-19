package day17_Recursion;

import java.util.Scanner;

class SumOfMain {
	public static int SumOfDigits(int num) {
		if (num == 0) {
			return 0;
		} else {
			return num % 10 + SumOfDigits(num / 10);
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = SumOfDigits(n);

		System.out.print("The sum of digits in " + n + " is " + sum);
	}
}

//Input (stdin)
//432
//
//Output (stdout)
//The sum of digits in 432 is 9