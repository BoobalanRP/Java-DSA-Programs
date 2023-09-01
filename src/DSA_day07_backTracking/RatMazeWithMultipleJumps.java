package dsa_day07_backTracking;

import java.util.Scanner;

public class RatMazeWithMultipleJumps {

	static final int MAX = 10;

	static boolean path(int[][] arr, int n, int[][] visited, int i, int j) {
		if (i == n - 1 && j == n - 1) {
			visited[i][j] = 1;
			return true;
		}

		if (i >= 0 && j >= 0 && i < n && j < n && visited[i][j] == 0) {
			visited[i][j] = 1;
			int m = arr[i][j];

			for (int temp = 1; temp <= m; temp++) {
				if (path(arr, n, visited, i, j + temp))
					return true;
				if (path(arr, n, visited, i + temp, j))
					return true;
			}

			visited[i][j] = 0;
			return false;
		}

		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t-- > 0) {
			int n = sc.nextInt();
			int[][] arr = new int[MAX][MAX];
			int[][] visited = new int[MAX][MAX];

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					arr[i][j] = sc.nextInt();
				}
			}

			boolean val = path(arr, n, visited, 0, 0);

			if (val == false) {
				System.out.println(-1);
			} else {
				for (int i = 0; i < n; i++) {
					for (int j = 0; j < n; j++) {
						System.out.print(visited[i][j] + " ");
					}
					System.out.println();
				}
			}
		}
	}
}

//Input (stdin)
//2
//4 
//2 1 0 0
//3 0 0 1
//0 1 0 1
//0 0 0 1
//4
//2 1 0 0
//2 0 0 1
//0 1 0 1
//0 0 0 1
//
//Output (stdout)
//1 0 0 0
//1 0 0 1
//0 0 0 1
//0 0 0 1
//-1
//
//
//
//Input (stdin)
//1
//4 
//2 1 0 0
//3 0 0 1
//0 1 0 1
//3 0 0 1
//
//Output (stdout)
//1 0 0 0
//1 0 0 0
//0 0 0 0
//1 0 0 1