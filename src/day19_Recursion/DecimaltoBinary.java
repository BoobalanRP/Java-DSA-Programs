package day19_Recursion;

import java.util.Scanner;

public class DecimaltoBinary {

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


//Input (stdin)
//123
//
//Output (stdout)
//1111011