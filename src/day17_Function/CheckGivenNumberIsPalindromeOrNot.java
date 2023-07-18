package day17_Function;

import java.util.Scanner;

public class CheckGivenNumberIsPalindromeOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String val = n + "";
		String let = "";
		int count = 0;
		for (int i = 0; i < val.length(); i++) {
			count = n % 10;
			n /= 10;
			let += count;
		}

		if (val.equals(let)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not an Palindrome");
		}

	}

}

//Input: 123456
//Not an Palindrome

//Input: 12321
//Palindrome