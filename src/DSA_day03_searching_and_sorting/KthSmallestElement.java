package dsa_day03_searching_and_sorting;

import java.util.*;

class KthSmallestElement {

	public static int kthSmallest(int[] arr, int K) {
		Arrays.sort(arr);
		return arr[K - 1];
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.print(kthSmallest(arr, k));
	}
}

//Input (stdin)
//6 3
//32 12 35 23 41 22
//
//Output (stdout)
//23