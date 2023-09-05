package dsa_day12_BitwiseOperations;

import java.util.Scanner;

public class ReverseBits {

	static int hex(int a, int b) {
		int out = a ^ b;
		int countX = Integer.bitCount(out);

		return countX;
	}

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < n; i++)
			a[i] = s.nextInt();

		int co = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				co += hex(a[i], a[j]);
			}
		}

		System.out.println(co);
	}

}
//
//Explanation:
//
//We return f(1, 1) + f(1, 3) + f(1, 5) + f(3, 1) + f(3, 3) + f(3, 5) + f(5, 1) + f(5, 3) + f(5, 5) = 0 + 1 + 1 + 1 + 0 + 2 + 1 + 2 + 0 = 8.
//
//
//Input (stdin)
//2
//2 4
//
//Output (stdout)
//4
