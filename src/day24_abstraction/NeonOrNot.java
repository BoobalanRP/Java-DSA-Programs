package day24_abstraction;

import java.util.Scanner;

abstract class Number {
	abstract boolean isNeon();
}

class NeonChecker extends Number {
	private int num;

	NeonChecker(int n) {
		num = n;
	}

	@Override
	boolean isNeon() {
		int square = num * num;
		int sumDigits = 0;

		while (square > 0) {
			sumDigits += square % 10;
			square /= 10;
		}

		return sumDigits == num;
	}
}

public class NeonOrNot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		NeonChecker nc = new NeonChecker(num);
		boolean isNeon = nc.isNeon();

		if (isNeon) {
			System.out.println("Neon");
		} else {
			System.out.println("Not Neon");
		}
	}
}

//1: 1^2 = 1, and 1 is the sum of its digits.
//5: 5^2 = 25, and 2 + 5 = 7, which is the original number.
//19: 19^2 = 361, and 3 + 6 + 1 = 10, which is the original number.

//Input (stdin)
//8
//
//Output (stdout)
//Not Neon