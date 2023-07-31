package day24_abstraction;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int result = detectArmstrongNumber(n);

		if (result == 1) {
			System.out.println("Armstrong");
		} else {
			System.out.println("Not Armstrong");
		}
	}

	public static int detectArmstrongNumber(int n) {
		int originalNumber = n;
		int sum = 0;
		int numberOfDigits = getNumberOfDigits(n);

		while (n > 0) {
			int digit = n % 10;
			sum += Math.pow(digit, numberOfDigits);
			n /= 10;
		}

		if (sum == originalNumber) {
			return 1; // Armstrong number
		} else {
			return 0; // Not an Armstrong number
		}
	}

	public static int getNumberOfDigits(int n) {
		int count = 0;

		while (n != 0) {
			n /= 10;
			count++;
		}

		return count;
	}

}

//Input (stdin)
//21
//
//Output (stdout)
//Not Armstrong
//
//
//Input (stdin)
//407
//
//Output (stdout)
//Armstrong