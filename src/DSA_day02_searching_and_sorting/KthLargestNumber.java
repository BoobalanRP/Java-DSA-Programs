package dsa_day02_searching_and_sorting;

import java.util.Arrays;
import java.util.Scanner;

public class KthLargestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		Arrays.sort(arr);
		for (int i = 1; i <= n; i++) {
			if ((n - m) == i) {
				System.out.println(arr[i]);
			}
		}

	}

}

//
//Input (stdin)
//6
//5 7 12 23 48 17
//4
//
//Output (stdout)
//12