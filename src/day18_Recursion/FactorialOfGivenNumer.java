package day18_Recursion;

import java.util.Scanner;

class FactorialMain {
	public static int FactorialOfGivenNumer(int val) {

		if (val > 1) {
			return val * FactorialOfGivenNumer(val - 1);
		} else {
			return 1;
		}

	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int value = FactorialOfGivenNumer(num);

		System.out.print("The factorial of " + num + " is " + value);
	}
}

//Input (stdin)
//5
//
//Output (stdout)
//The factorial of 5 is 120