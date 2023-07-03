package day06;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		int factorial = 1;
		int i = 1;

		while (factorial < n) {
			i++;
			factorial *= i;
		}

		if (factorial == n) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		scanner.close();

	}

}
