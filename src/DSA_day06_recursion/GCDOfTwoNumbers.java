package DSA_day06_recursion;

import java.util.Scanner;

public class GCDOfTwoNumbers {

	public static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		} else {
			return gcd(b, a % b);
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int val = gcd(a, b);

		System.out.print("G.C.D of " + a + " and " + b + " is " + val);
	}
}
