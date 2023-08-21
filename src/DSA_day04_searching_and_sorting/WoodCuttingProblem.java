package DSA_day04_searching_and_sorting;

import java.util.*;

class WoodCuttingProblem {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int low = 0, high = Integer.MAX_VALUE;
		int ans = 0;

		while (low <= high) {
			int mid = low + (high - low) / 2;

			if (canCutWood(arr, n, mid, x)) {
				ans = mid;
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}

		System.out.println(ans);
	}

	public static boolean canCutWood(int arr[], int n, int height, int requiredWood) {
		long totalWood = 0;

		for (int i = 0; i < n; i++) {
			if (arr[i] > height) {
				totalWood += arr[i] - height;
			}
		}

		return totalWood >= requiredWood;
	}
}
