package DSA_day06_recursion;

import java.util.*;

public class DecimalToBinary {
	public static String decimalToBinary(int num) {
		if (num == 0) {
			return "0";
		}
		if (num == 1) {
			return "1";
		}
		int remainder = num % 2;
		int quotient = num / 2;
		return decimalToBinary(quotient) + remainder;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int decimalNumber = sc.nextInt();
		String binaryNumber = decimalToBinary(decimalNumber);
		System.out.println(binaryNumber);
	}
}