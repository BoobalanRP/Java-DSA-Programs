package day15_String;

import java.util.Scanner;

public class StringRotationJava {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		String rotate = sc.nextLine();
		if (word.length() != rotate.length()) {
			System.out.println("Second string is not a rotation of the first string");
		} else {
			String concatenated = word + word;
			if (concatenated.contains(rotate)) {
				System.out.println("Second string is a rotation of first string");
			} else {
				System.out.println("Second string is not a rotation of first string");
			}
		}

	}

}
//Input (stdin)
//abcde
//cdeab
//
//Output (stdout)
//Second string is a rotation of first string