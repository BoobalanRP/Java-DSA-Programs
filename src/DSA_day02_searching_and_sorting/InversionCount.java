package dsa_day02_searching_and_sorting;

import java.util.Scanner;

public class InversionCount {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		if (n < 2) {
			System.out.println(0);
			return;
		}

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}

		int invCount = 0;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] > arr[j]) {
					invCount++;
				}
			}
		}

		System.out.println(invCount);
	}
}
//Input (stdin)
//7
//13 10 9 6 21 15 14
//
//Output (stdout)
//9