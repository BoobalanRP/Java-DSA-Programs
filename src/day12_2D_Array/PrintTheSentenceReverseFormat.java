package day12_2D_Array;

import java.util.Scanner;

public class PrintTheSentenceReverseFormat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String rev = "";

		String s[] = str.split(" ");
		String specialChar = "";
		for (int i = 0; i < s.length; i++) {
			String word = "";
			for (int j = 1; j <= s[i].length(); j++) {
				char letter = s[i].charAt(s[i].length() - j);
				if (letter == '!' || letter == '@' || letter == '$' || letter == '%' || letter == '*'
						|| letter == '#') {
					specialChar += letter;
				} else {
					word += letter;
				}
			}
			s[i] = word;
		}
		for (int i = 0; i < s.length; i++) {
			rev = s[i] + " " + rev;
		}

		System.out.println(rev + specialChar);

	}

}
