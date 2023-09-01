package dsa_day06_recursion;

import java.util.Scanner;

public class IsPrimeNumber {

	public static boolean isPrimeNumber(int num, int divisor) {
		if (num <= 2) {
			return num == 2;
		} else if (num % divisor == 0) {
			return false;
		} else if (divisor > Math.sqrt(num)) {
			return true;
		}

		return isPrimeNumber(num, divisor + 1);
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int val = sc.nextInt();

		boolean result = isPrimeNumber(val, 2);
		if (result) {
			System.out.println("Prime Number");
		} else {
			System.out.println("Not a Prime Number");
		}
	}
}

//Input (stdin)
//199
//
//Output (stdout)
//Prime Number
//
//
//Input (stdin)
//63
//
//Output (stdout)
//Not a Prime Number