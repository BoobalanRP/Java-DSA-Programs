package day16_String;

import java.util.Scanner;

public class RemoveTheCharactersOfOddIndexValuesInAString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String val = sc.next();
		String word = "";
		for (int i = 0; i < val.length(); i++) {
			if ((i + 1) % 2 == 1) {
				word += val.charAt(i);
			}

		}
		System.out.println(word);

	}

}

//
//Input (stdin)
//hello
//
//Output (stdout)
//hlo