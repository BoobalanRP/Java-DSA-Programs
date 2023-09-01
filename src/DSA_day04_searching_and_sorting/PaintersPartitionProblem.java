package dsa_day04_searching_and_sorting;

import java.util.Scanner;

public class PaintersPartitionProblem {
	public static boolean canPaint(int[] boards, int a, int b, long mid) {
		int painters = 1;
		long currTime = 0;
		for (int board : boards) {
			if (board * b > mid) {
				return false; // Single board too large for a painter
			}
			if (currTime + (long) board * b <= mid) {
				currTime += (long) board * b;
			} else {
				painters++;
				currTime = (long) board * b;
			}
			if (painters > a) {
				return false; // Too many painters needed
			}
		}
		return true;
	}

	public static int paintBoards(int a, int b, int n, int[] lengths) {
		long left = 0;
		long right = 0;
		for (int length : lengths) {
			right += (long) length * b;
		}
		long result = 0;
		while (left <= right) {
			long mid = left + (right - left) / 2;
			if (canPaint(lengths, a, b, mid)) {
				result = mid;
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		return (int) (result % 10000003);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int n = scanner.nextInt();
		int[] lengths = new int[n];
		for (int i = 0; i < n; i++) {
			lengths[i] = scanner.nextInt();
		}
		int minTime = paintBoards(a, b, n, lengths);
		System.out.println(minTime);
		scanner.close();
	}
}


//Input (stdin)
//2 5
//2
//1 10
//
//Output (stdout)
//50
//
//Input (stdin)
//3 4
//5
//3 2 4 3 2
//
//Output (stdout)
//20