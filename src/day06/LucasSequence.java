package day06;

import java.util.Scanner;

public class LucasSequence {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		int a = 0, b = 0, c = 1;

		System.out.print(a + " " + b + " " + c);

		for (int i = 4; i <= n; i++) {
			int nextTerm = a + b + c;
			System.out.print(" " + nextTerm);
			a = b;
			b = c;
			c = nextTerm;
		}

	}

}
