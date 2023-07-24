package day19_Recursion;

import java.util.Scanner;

public class SumOfTheGivenRageNumber {
	public static int SumOfValues(int a1) {
		if (a1 == 0) {
			return 0;
		}

		return a1 + SumOfValues(a1 - 1);

	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int val = SumOfValues(n1);
		System.out.println(val);
	}
}

//
//Input (stdin)
//34
//
//Output (stdout)
//595
