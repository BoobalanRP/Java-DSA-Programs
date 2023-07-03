package day05;

import java.util.Scanner;

public class CharacterPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		String pattern = "";
		for (int i = 1; i <= num; i++) {

			if (i % 2 == 1) {
				pattern += "*";
			} else {
				pattern += "#";
			}
			System.out.println(pattern);
		}

	}

}
