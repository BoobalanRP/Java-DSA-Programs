package day02;

import java.util.Scanner;

public class NumberDiamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 0; i <= n; i++) {
			for (int j = 0; j < n - i; j++) {
				System.out.print(".");
			}

			for (int k = n - i + 1; k <= n; k++) {
				System.out.print(k);
			}

			System.out.print(0);

			for (int k = n; k >= n - i + 1; k--) {
				System.out.print(k);
			}

			System.out.println();
		}
		
//		second format

//		for (int i = 0; i <= n; i++) {
//
//			for (int j = 0; j < n - i; j++) {
//				System.out.print(".");
//
//			}
//			if (i == 0) {
//				System.out.println(0);
//			} else {
//				for (int k = n - i + 1; k <= n; k++) {
//					System.out.print(k);
//				}
//				System.out.print(0);
//				for (int k = n; k >= n - i + 1; k--) {
//					System.out.print(k);
//				}
//				System.out.println();
//			}
//
//		}

	}

}
