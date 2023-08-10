package hackerRankProblems;

import java.util.Scanner;

public class Anagrams {

	static boolean isAnagram(String a, String b) {
		if (a.length() != b.length()) {
			return false;
		} else {
			char c1[] = a.toLowerCase().toCharArray();
			char c2[] = b.toLowerCase().toCharArray();
			java.util.Arrays.sort(c1); // Explicitly accessing java.util.Arrays.
			java.util.Arrays.sort(c2);

			return java.util.Arrays.equals(c1, c2);
		}

	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");
	}
}

//Sample Input 0
//
//anagram
//margana
//Sample Output 0
//
//Anagrams
//

//Sample Input 1
//
//anagramm
//marganaa
//Sample Output 1
//
//Not Anagrams