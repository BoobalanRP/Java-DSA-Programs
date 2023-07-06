package day10;

import java.util.*;

public class ArrayMedian {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr1 = new int[n];
		for (int i = 0; i < n; i++) {
			arr1[i] = sc.nextInt();
		}
		Arrays.sort(arr1);

		int mid = (int) Math.ceil(arr1.length / 2.0);
		int firstValue = 0;
		int lastValue = 0;
		int divide = 0;
		if (n % 2 == 1) {
			System.out.printf("The median of the array is %.2f", (double) arr1[mid - 1]);
		} else {
			firstValue = arr1[mid - 1];
			lastValue = arr1[mid];
			divide = (firstValue + lastValue) / 2;
			System.out.printf("The median of the array is %.2f", (double) divide);
		}

	}

}
