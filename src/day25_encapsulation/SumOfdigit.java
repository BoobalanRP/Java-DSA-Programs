package day25_encapsulation;

import java.util.Scanner;

class DigitSumCalculator {
	public static int calculateSumOfDigits(int number) {
		int sum = 0;
		while (number != 0) {
			int digit = number % 10;
			sum += digit;
			number /= 10;
		}
		return sum;
	}
}

public class SumOfdigit {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int number = scanner.nextInt();

		int sumOfDigits = DigitSumCalculator.calculateSumOfDigits(number);
		System.out.println(sumOfDigits);
	}
}

//Input (stdin)
//1896
//
//Output (stdout)
//24