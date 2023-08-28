package DSA_day07_backTracking;

import java.util.Scanner;

public class JosepheusProblem {

	public static int josepheus(int n, int r) {
		if (n == 0) {
			return 0;
		}
		return ((josepheus(n - 1, r) + r) % n);
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r = sc.nextInt();
		int val = josepheus(n, r);
		System.out.println(val + 1);
	}

}
//Input (stdin)
//100
//2
//
//Output (stdout)
//73
