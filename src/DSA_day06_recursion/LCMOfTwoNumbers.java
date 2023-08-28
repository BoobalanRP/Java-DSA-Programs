package DSA_day06_recursion;

import java.util.Scanner;

public class LCMOfTwoNumbers {
	public static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}

	public static int lcm(int a, int b) {
		return (a * b) / gcd(a, b);
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();

		int result = lcm(n1, n2);
		System.out.println(result);
	}

}

//Input (stdin)
//24
//36
//
//Output (stdout)
//72