package day07;

import java.util.Scanner;

public class ArmstrongNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int result = detectArmstrongNumber(n);
		System.out.println(result);
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
