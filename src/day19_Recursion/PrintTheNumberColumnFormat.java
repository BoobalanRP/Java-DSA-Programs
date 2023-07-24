package day19_Recursion;

import java.util.Scanner;

public class PrintTheNumberColumnFormat {
	public static void printDigit(String a1, int a2, int a3) {
		if (a3 <= a2) {
			System.out.println(a1.charAt(a3));
			printDigit(a1, a2, a3 + 1);
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		String len = n1 + "";
		printDigit(len, len.length() - 1, 0);
	}

}

//Input (stdin)
//65798
//
//Output (stdout)
//6
//5
//7
//9
//8