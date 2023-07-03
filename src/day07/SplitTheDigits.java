package day07;

import java.util.Scanner;

public class SplitTheDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt();

		int digit1 = number / 100000;
		int digit2 = (number / 10000) % 10;
		int digit3 = (number / 1000) % 10;
		int digit4 = (number / 100) % 10;
		int digit5 = (number / 10) % 10;
		int digit6 = number % 10;

		System.out.println(digit1 + " " + digit2 + " " + digit3 + " " + digit4 + " " + digit5 + " " + digit6);

	}

}
