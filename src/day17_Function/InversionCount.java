package day17_Function;

import java.util.*;

class CountMain {
	public static int InversionCount(int[] arr1, int n) {
		int count = 0;
		for (int j = 0; j < n; j++) {
			for (int k = j + 1; k < n; k++) {
				if (arr1[j] > arr1[k]) {
					count++;
				}
			}
		}
		return count;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] arr = new int[num];
		for (int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}
		int value = InversionCount(arr, num);
		System.out.println(value);
	}
}
//
//Input (stdin)
//5
//1 20 6 4 5
//
//Output (stdout)
//5
