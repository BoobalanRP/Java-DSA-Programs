package DSA_day04_searching_and_sorting;

import java.util.*;

class Main {

	public static int binarySearch(int arr[], int start, int end, int n) {
		int mid = (start + end) / 2;
		if (start <= end) {

			if (arr[mid] == n) {
				return 1;
			} else if (arr[mid] > n) {
				return binarySearch(arr, start, mid - 1, n);
			} else if (arr[mid] < n) {
				return binarySearch(arr, mid + 1, end, n);
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int num = sc.nextInt();
		int find = binarySearch(arr, 0, arr.length - 1, num);
		System.out.println(find);
	}
}

//Input (stdin)
//4
//23 34 45 67
//34
//
//Output (stdout)
//1
//
//Input (stdin)
//6
//11 15 26 38 9 10
//20
//
//Output (stdout)
//0

//import java.util.*;
//
//class BinarySearch {
//	public static int binarySearch(int arr[], int start, int end, int target) {
//		while (start <= end) {
//			int mid = (start + end) / 2;
//
//			if (arr[mid] == target) {
//				return 1;
//			} else if (arr[mid] < target) {
//				start = mid + 1;
//			} else {
//				end = mid - 1;
//			}
//		}
//
//		return 0;
//	}
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int arr[] = new int[n];
//		for (int i = 0; i < n; i++) {
//			arr[i] = sc.nextInt();
//		}
//		int target = sc.nextInt();
//
//		int result = binarySearch(arr, 0, n - 1, target);
//		System.out.println(result);
//	}
//}
