package day15_String;

import java.util.Scanner;

public class FindPalindromeOrNotForGivenString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		String cleanedWord = word.replaceAll(" ", "").toLowerCase();
		String reversedWord = "";
		for (int i = cleanedWord.length() - 1; i >= 0; i--) {
			reversedWord += cleanedWord.charAt(i);
		}
		if (cleanedWord.equals(reversedWord)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a palindrome");
		}
	}

}
//Input (stdin)
//Live on time emit no evil
//
//Output (stdout)
//Palindrome