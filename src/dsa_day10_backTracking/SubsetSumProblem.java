package dsa_day10_backTracking;

import java.util.Scanner;

public class SubsetSumProblem {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		int findValue = sc.nextInt();

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		boolean[] dp = new boolean[findValue + 1];
		dp[0] = true;

		for (int num : arr) {
			for (int j = findValue; j >= num; j--) {
				if (dp[j - num]) {
					dp[j] = true;
				}

			}
		}

		System.out.println(dp[findValue] ? "yes" : "no");
	}

}
