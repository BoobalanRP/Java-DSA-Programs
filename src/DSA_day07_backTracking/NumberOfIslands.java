package dsa_day07_backTracking;

import java.util.*;

class Main {
	static int count = 0;

	public static void isLand(int[][] a, int i, int j, int n, int m) {

		if (i < 0 || i >= n || j < 0 || j >= m || a[i][j] == 0) {
			return;
		}

		a[i][j] = 0;

		isLand(a, i - 1, j, n, m);
		isLand(a, i + 1, j, n, m);
		isLand(a, i - 1, j - 1, n, m);
		isLand(a, i + 1, j + 1, n, m);
		isLand(a, i, j - 1, n, m);
		isLand(a, i, j + 1, n, m);
		isLand(a, i - 1, j + 1, n, m);
		isLand(a, i + 1, j - 1, n, m);

	}

	public static void main(String args[]) {
		// Try out your code here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] a = new int[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				a[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (a[i][j] != 0) {
					count++;
					isLand(a, i, j, n, m);
				}
			}
		}

		System.out.println(count - 1);
	}
}

//Input (stdin)
//5 5 
//1 1 0 0 0 
//0 1 0 0 1
//1 0 0 1 1
//0 0 0 0 0 
//1 0 1 0 1
//
//Output (stdout)
//4