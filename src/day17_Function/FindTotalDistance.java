package day17_Function;

import java.util.*;

class TotalMain {
	public static int FindTotalDistance(int[] arr1, int n) {
		int count = 0, token = 0;
		for (int i = 0; i < arr1.length - 1; i++) {
			token = Math.abs(arr1[i] - arr1[i + 1]);
			count += token;
		}
		return count;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int val = sc.nextInt();
		int[] arr = new int[val];
		for (int i = 0; i < val; i++) {
			arr[i] = sc.nextInt();
		}
		int num = FindTotalDistance(arr, val);
		System.out.println(num);
	}
}
//
//Input (stdin)
//5
//10 11 7 12 14
//
//Output (stdout)
//12