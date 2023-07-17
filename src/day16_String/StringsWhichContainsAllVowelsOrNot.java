package day16_String;

import java.util.Scanner;

public class StringsWhichContainsAllVowelsOrNot {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String val = sc.nextLine();
		String val1 = val.toLowerCase();
		String word = "aeiou", result = "";
		int count = 0;
		for (int j = 0; j < word.length(); j++) {
			for (int i = 0; i < val1.length(); i++) {
				if (word.charAt(j) == val1.charAt(i)) {
					count++;
					break;
				}
			}

		}
		if (count == 5) {
			System.out.println("Accepted");
		} else {
			System.out.println("Not Accepted");
		}

	}

}

//
//Input (stdin)
//EDUCATION
//
//Output (stdout)
//Accepted

//Input (stdin)
//Racecar
//
//Output (stdout)
//Not Accepted