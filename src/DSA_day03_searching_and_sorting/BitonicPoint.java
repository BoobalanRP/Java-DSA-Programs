package DSA_day03_searching_and_sorting;

import java.util.*;

class BitonicPoint {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

				}

			}
		}

		System.out.println(arr[n - 1]);
	}
}
//
//Input (stdin)
//8
//1 3 5 8 9 7 6 5
//
//Output (stdout)
//9