package day14_String;

import java.util.Scanner;

//Input (stdin)
//mam
//
//Output (stdout)
//Palindrome

public class StringPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		String palindrome = "";
		char a;
		for (int i = 0; i < word.length(); i++) {
			a = word.charAt(word.length() - i - 1);
			palindrome += a;
		}

		if (word.equals(palindrome)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a Palindrome");
		}

	}

}
