package dsa_day12_BitwiseOperations;

import java.util.Scanner;

public class BinaryPalindrome {

	public static String isBinaryPalindrome(int N) {
		String binaryString = Integer.toBinaryString(N);
		int left = 0;
		int right = binaryString.length() - 1;

		while (left < right) {
			if (binaryString.charAt(left) != binaryString.charAt(right)) {
				return "no";
			}
			left++;
			right--;
		}

		return "yes";
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		String result = isBinaryPalindrome(N);
		System.out.println(result);
	}

}

//Input (stdin)
//9
//
//Output (stdout)
//yes
//
//Input (stdin)
//98
//
//Output (stdout)
//no
