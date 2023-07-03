package day06;

import java.util.Scanner;

public class KaprekarNumber {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int number = scanner.nextInt();

		int square = number * number;
		int numDigits = String.valueOf(number).length();
		int divisor = (int) Math.pow(10, numDigits);

		int sum = (square / divisor) + square % divisor;

		if (sum == number) {
			System.out.println("Kaprekar Number");
		} else {
			System.out.println("Not A Kaprekar Number");
		}

		scanner.close();
	}
}
