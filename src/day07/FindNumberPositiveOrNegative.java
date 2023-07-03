package day07;

import java.util.Scanner;

public class FindNumberPositiveOrNegative {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int passitiveCount = 0;
		int negativeCount = 0;
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();

			if (a >= 0) {
				passitiveCount++;
			} else if (a < 0) {
				negativeCount++;
			}
		}

		System.out.println("Positive numbers: " + passitiveCount);
		System.out.println("Negative numbers: " + negativeCount);
	}

}
