package day04;

import java.util.Scanner;

public class NumberPasitiveOrNegative {

	public static void main(String[] args) {

		Scanner n = new Scanner(System.in);
		int num = n.nextInt();
		if (num > 0) {
			System.out.println("Positive");
		} else {
			System.out.println("Negative");
		}

	}

}
