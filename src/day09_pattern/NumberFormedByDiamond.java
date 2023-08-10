package day09_pattern;
//Input (stdin)

//3
//
//Output (stdout)
//      0
//    0 1 0
//  0 1 2 1 0
//0 1 2 3 2 1 0
//  0 1 2 1 0
//    0 1 0
//      0

import java.util.Scanner;

public class NumberFormedByDiamond {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i <= n; i++) {
			for (int j = 1; j <= (n * 2) - i * 2; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print(j + " ");
			}
			if (i >= 1) {
				for (int j = i - 1; j >= 0; j--) {
					System.out.print(j + " ");
				}
			}
			System.out.println();
		}
		// reverse diamond
		for (int i = n - 1; i >= 0; i--) {
			for (int j = 1; j <= (n * 2) - i * 2; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print(j + " ");
			}
			if (i >= 1) {
				for (int j = i - 1; j >= 0; j--) {
					System.out.print(j + " ");
				}
			}
			System.out.println();
		}

	}

}
