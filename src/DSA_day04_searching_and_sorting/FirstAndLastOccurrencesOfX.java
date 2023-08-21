package DSA_day04_searching_and_sorting;

import java.util.*;

class FirstAndLastOccurence {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int firstOccurrence = findFirstOccurrence(arr, n, x);
		int lastOccurrence = findLastOccurrence(arr, n, x);

		System.out.println(firstOccurrence + " " + lastOccurrence);
	}

	public static int findFirstOccurrence(int arr[], int n, int x) {
		int low = 0, high = n - 1;
		int firstOccurrence = -1;

		while (low <= high) {
			int mid = low + (high - low) / 2;

			if (arr[mid] == x) {
				firstOccurrence = mid;
				high = mid - 1;
			} else if (arr[mid] < x) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}

		return firstOccurrence;
	}

	public static int findLastOccurrence(int arr[], int n, int x) {
		int low = 0, high = n - 1;
		int lastOccurrence = -1;

		while (low <= high) {
			int mid = low + (high - low) / 2;

			if (arr[mid] == x) {
				lastOccurrence = mid;
				low = mid + 1;
			} else if (arr[mid] < x) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}

		return lastOccurrence;
	}
}

//Input (stdin)
//8 4
//1 3 4 4 4 4 6 7
//
//Output (stdout)
//2 5
//
//
//Input (stdin)
//4 5
//-1 2 3 4
//
//Output (stdout)
//-1 -1
