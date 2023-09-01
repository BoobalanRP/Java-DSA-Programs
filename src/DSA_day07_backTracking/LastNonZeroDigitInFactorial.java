package dsa_day07_backTracking;

import java.math.BigInteger;
import java.util.Scanner;

public class LastNonZeroDigitInFactorial {

	public static BigInteger firstNumberFactorial(int num1) {
		if (num1 == 0) {
			return BigInteger.ONE;
		}

		return BigInteger.valueOf(num1).multiply(firstNumberFactorial(num1 - 1));
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt();
		for (int i = 0; i < total; i++) {
			int val1 = sc.nextInt();
			BigInteger bigVal1 = firstNumberFactorial(val1);
			String first = bigVal1.toString();
			int result1 = 0;

			for (int j = first.length() - 1; j >= 0; j--) {
				if (first.charAt(j) != '0') {
					result1 = Character.getNumericValue(first.charAt(j));
					break;
				}
			}

			System.out.println(result1);
		}
	}

}

//Input (stdin)
//2
//5
//33
//
//Output (stdout)
//2
//8
//
//
//Input (stdin)
//3
//99
//75
//70
//
//Output (stdout)
//4
//4
//8
