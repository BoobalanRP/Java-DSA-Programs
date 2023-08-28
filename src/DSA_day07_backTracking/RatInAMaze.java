package DSA_day07_backTracking;

import java.util.Scanner;

public class RatInAMaze {

	static int path = 0;

	static void rat_maze(int sr, int sc, int n, int[][] a) {
		if (sr < 0 || sc < 0 || sc > n || sr > n || a[sr][sc] == 0) {
			return;
		}

		if (sr == n && sc == n) {
			path++;
		}
		a[sr][sc] = 0;
		rat_maze(sr, sc + 1, n, a);
		rat_maze(sr + 1, sc, n, a);
		rat_maze(sr - 1, sc, n, a);
		rat_maze(sr, sc - 1, n, a);
		a[sr][sc] = 1;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		int arr[][] = new int[n][n];
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				arr[i][j] = s.nextInt();

		rat_maze(0, 0, n - 1, arr);
		System.out.print(path);
	}

}

//Input (stdin)
//3
//1 0 1
//1 1 0
//1 1 1
//
//Output (stdout)
//2
//
//
//Input (stdin)
//3
//1 1 1
//1 1 1
//1 1 1
//
//Output (stdout)
//12