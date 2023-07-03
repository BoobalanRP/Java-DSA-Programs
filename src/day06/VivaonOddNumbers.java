package day06;

import java.util.Scanner;

public class VivaonOddNumbers {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		double score = 0.0;

		for (int i = 0; i < 3; i++) {
			int number = scanner.nextInt();

			if (number % 2 == 1 && number > 0) {

				score += 1.0;
			} else if (number < 0) {
				score -= 1.0;
				break;
			} else {
				score -= 0.5;
			}
		}

		System.out.printf("%.1f", score);

	}

}
