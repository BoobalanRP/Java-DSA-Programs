package day19_Recursion;

import java.util.Scanner;

public class BaseNumbersFinding {
	public static String baseNumbers(int a1, int a2) {
		if (a1 == 0) {
			return "";
		}

		int remainder = a1 % a2;
		int quotient = a1 / a2;
		return baseNumbers(quotient, a2) + remainder;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n1 = sc.nextInt();
		System.out.println("Enter the base to which you want to convert");
		int n2 = sc.nextInt();

		String val = baseNumbers(n1, n2);
		System.out.println(val);
	}
}

//Input (stdin)
//10
//3
//
//Output (stdout)
//Enter the value of n
//Enter the base to which you want to convert
//101