package day17_Recursion;

import java.util.Scanner;

class GreatMain {
	public static int GreatestCommonDivisors(int a, int b) {
		if (b == 0) {
			return a;
		} else {
			return GreatestCommonDivisors(b, a % b);
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();

		int gcd = GreatestCommonDivisors(m, n);
		System.out.println("G.C.D of " + m + " and " + n + " is " + gcd);
	}
}
