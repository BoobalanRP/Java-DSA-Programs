package DSA_day08_backTracking;

import java.util.Scanner;

public class GreatForests {

	public static int forests(int r, int c, int n, char[][] arr) {
		if (r < 0 || r >= n || c < 0 || c >= n || arr[r][c] == 'W') {
			return 0;
		}
		arr[r][c] = 'W';
		int size = 1;
		size += forests(r - 1, c, n, arr);
		size += forests(r + 1, c, n, arr);
		size += forests(r, c - 1, n, arr);
		size += forests(r, c + 1, n, arr);
		return size;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[][] arr = new char[n][n];

		for (int i = 0; i < n; i++) {
			String row = sc.next();
			arr[i] = row.toCharArray();
		}

		int max = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (arr[i][j] == 'T') {
					int val = forests(i, j, n, arr);
					if (val > max) {
						max = val;
					}
				}
			}
		}
		System.out.println(max);
	}
}

//Input (stdin)
//5
//TTTWW
//TWWTT
//TWWTT
//TWTTT
//WWTTT
//
//Output (stdout)
//10
//
//Input (stdin)
//6
//TTTWWT
//TWWTTT
//TWWTTT
//TWTTTW
//WWTTTW
//TWWTWW
//
//Output (stdout)
//14