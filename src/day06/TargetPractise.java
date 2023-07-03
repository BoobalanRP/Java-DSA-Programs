package day06;

import java.util.Scanner;

public class TargetPractise {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int a, c = 0, s = 0;

		do {
			c++;
			a = scanner.nextInt();
			s += a;

		} while (s <= n);

		System.out.println("The number of turns is " + c);

		scanner.close();
	}
}
