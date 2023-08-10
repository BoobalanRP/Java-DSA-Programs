package day09_pattern;

import java.util.*;

class GFG {
	public static void printHosoya(int n) {
		int[][] dp = new int[n][n];

		dp[0][0] = dp[1][0] = dp[1][1] = 1;

		for (int i = 2; i < n; i++) {// i=2,3

			for (int j = 0; j < n; j++) {// j=0,1,2,3

				if (i > j)// 2>0 2>1
					dp[i][j] = dp[i - 1][j] + dp[i - 2][j];// dp[2][0]=1+1=2

				else
					dp[i][j] = dp[i - 1][j - 1] + dp[i - 2][j - 2];// dp[2][2]=1+1=2 dp[2][3]=0+0=0 dp[2][4]=0
			}
		}
		int temp;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				temp = 96 + dp[i][j];
				System.out.print((char) temp);
			}

			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		printHosoya(n);
	}
}

//Input : n = 5
//Output :
//     1
//    1 1
//   2 1 2
//  3 2 2 3
// 5 3 4 3 5
//8 5 6 6 5 8