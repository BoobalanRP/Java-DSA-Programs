package dsa_day03_searching_and_sorting;

import java.util.Scanner;

public class MedianOfTwoSortedArraysSameSize {

	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int x = nums1.length;
		int y = nums2.length;

		int[] merged = new int[x + y];
		int i = 0, j = 0, k = 0;

		while (i < x && j < y) {
			if (nums1[i] < nums2[j]) {
				merged[k++] = nums1[i++];
			} else {
				merged[k++] = nums2[j++];
			}
		}

		while (i < x) {
			merged[k++] = nums1[i++];
		}

		while (j < y) {
			merged[k++] = nums2[j++];
		}

		if ((x + y) % 2 == 0) {
			int mid = (x + y) / 2;
			return (double) (merged[mid - 1] + merged[mid]) / 2;
		} else {
			return merged[(x + y) / 2];
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int arr1[] = new int[n];
		int arr2[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr1[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			arr2[i] = sc.nextInt();
		}

		double median = findMedianSortedArrays(arr1, arr2);
		System.out.println(median);
	}

}

//Input (stdin)
//4
//2 4 6 24
//6 8 9 10
//
//Output (stdout)
//7
//
//Input (stdin)
//5
//1 12 15 26 38
//2 13 17 30 45
//
//Output (stdout)
//16