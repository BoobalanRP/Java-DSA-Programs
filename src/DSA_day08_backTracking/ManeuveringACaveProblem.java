package DSA_day08_backTracking;

import java.util.Scanner;

public class ManeuveringACaveProblem {

	public static int caveProblem(int r, int c, int n, int m) {
		if (r > n || c > m) {
			return 0;
		}
		if (r == n && c == m) {
			return 1;
		}
		return caveProblem(r, c + 1, n, m) + caveProblem(r + 1, c, n, m);
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int val = caveProblem(0, 0, n - 1, m - 1);
		System.out.println(val);
	}
}
//
//Input (stdin)
//4 4 
//
//Output (stdout)
//20