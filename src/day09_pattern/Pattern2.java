package day09_pattern;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(0);
		for (int i = 2; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				if (i == 2 || i == 6 || i == 10 || i == 14 || i == 3 || i == 7 || i == 11 || i == 15) {
					if (j % 2 == 1) {
						System.out.print(1 + " ");
					} else {
						System.out.print(0 + " ");
					}
				} else {
					if (j % 2 == 1) {
						System.out.print(0 + " ");
					} else {
						System.out.print(1 + " ");
					}
				}

			}
			System.out.println();
		}
	}

}
