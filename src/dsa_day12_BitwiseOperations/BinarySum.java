package dsa_day12_BitwiseOperations;

import java.util.Scanner;

public class BinarySum {

	static String addBinary(String A, String B) {
		// initialize the ith index
		int i = A.length() - 1;
		// initialize the jth index
		int j = B.length() - 1;
		// initialize the carry
		int carry = 0;
		// initialize the sum
		int sum = 0;
		StringBuilder result = new StringBuilder();
		while (i >= 0 || j >= 0 || carry == 1) {
			sum = carry;
			if (i >= 0) {
				sum = sum + A.charAt(i) - '0';
			}
			if (j >= 0) {
				sum = sum + B.charAt(j) - '0';
			}
			result.append((char) (sum % 2 + '0'));
			carry = sum / 2;
			i--;
			j--;
		}
		return result.reverse().toString();
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String b = sc.nextLine();

		System.out.print(addBinary(a, b));
	}
}

//Input (stdin)
//1010
//1011
//
//Output (stdout)
//10101
//
//Input (stdin)
//11
//1
//
//Output (stdout)
//100