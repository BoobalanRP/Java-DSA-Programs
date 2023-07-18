package day17_Function;

import java.util.*;

class SumMain {
	public static int SumOfTheElementInArray(int[] arr, int len) {
		int sum = 0;
		for (int i = 0; i < len; i++) {
			sum += arr[i];
		}

		return sum;
	}

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		int x = SumOfTheElementInArray(arr, n);
		System.out.print(x);
	}
}