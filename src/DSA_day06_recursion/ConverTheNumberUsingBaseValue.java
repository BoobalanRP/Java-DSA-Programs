package dsa_day06_recursion;

import java.util.Scanner;

public class ConverTheNumberUsingBaseValue {

	public static String convertToBase(int num, int base) {
		if (num == 0) {
			return "";
		} else {
			int remainder = num % base;
			return convertToBase(num / base, base) + remainder;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the value of n");
		int num = sc.nextInt();

		System.out.println("Enter the base to which you want to convert");
		int base = sc.nextInt();

		String result = convertToBase(num, base);
		System.out.println(result);
	}

}
