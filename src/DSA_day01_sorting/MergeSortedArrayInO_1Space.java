package dsa_day01_sorting;

import java.util.Scanner;

public class MergeSortedArrayInO_1Space {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int m = sc.nextInt();
		int[] arr1 = new int[m];
		int n = sc.nextInt();
		for (int i = 0; i < m; i++) {
			arr1[i] = sc.nextInt();
		}

		int[] arr2 = new int[n];
		for (int i = 0; i < n; i++) {
			arr2[i] = sc.nextInt();
		}

		int[] mergedArray = mergeSortedArrays(arr1, arr2);

		for (int i = 0; i < mergedArray.length; i++) {
			System.out.print(mergedArray[i]);
			if (i < mergedArray.length - 1) {
				System.out.print(" ");
			}
		}

		sc.close();
	}

	static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
		int m = arr1.length;
		int n = arr2.length;
		int[] merged = new int[m + n];

		int i = 0, j = 0, k = 0;

		while (i < m && j < n) {
			if (arr1[i] <= arr2[j]) {
				merged[k++] = arr1[i++];
			} else {
				merged[k++] = arr2[j++];
			}
		}

		while (i < m) {
			merged[k++] = arr1[i++];
		}

		while (j < n) {
			merged[k++] = arr2[j++];
		}

		return merged;
	}

}
