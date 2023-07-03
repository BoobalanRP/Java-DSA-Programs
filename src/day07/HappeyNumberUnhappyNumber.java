package day07;

import java.util.Scanner;

public class HappeyNumberUnhappyNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt();

		boolean isHappy = isHappyNumber(number);

		if (isHappy) {
			System.out.println("Happy Number");
		} else {
			System.out.println("Unhappy Number");
		}
	}

	public static boolean isHappyNumber(int number) {
		while (number != 1 && number != 4) {
			int sum = 0;

			while (number != 0) {
				int digit = number % 10;
				sum += digit * digit;
				number /= 10;
			}

			number = sum;
		}

		return number == 1;

	}

}
