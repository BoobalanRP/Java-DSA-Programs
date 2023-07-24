package day19_Recursion;

import java.util.Scanner;

public class FindTheGivenNumbersRage {
	public static void numbersRange(int a1, int a2, int a3) {
		if (a3 <= a2) {
			System.out.print(a3 + " ");
			numbersRange(a1, a2, a3 + 2);
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();

		numbersRange(n1, n2, n1);

	}

}
//Input (stdin)
//5
//15
//
//Output (stdout)
//5 7 9 11 13 15