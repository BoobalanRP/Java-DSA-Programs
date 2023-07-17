package day16_String;

import java.util.Scanner;

public class HighestOccurrenceOfCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String string1 = sc.nextLine();
		String word = "";
		int max = 0;
		char letter = '\0'; // Initialize letter outside the loop

		for (char wr = 'a'; wr <= 'z'; wr++) {
			int count = 0;
			for (int i = 0; i < string1.length(); i++) {
				if (string1.charAt(i) == wr) {
					count++;
				}
				if (max < count) {
					max = count;
					letter = string1.charAt(i);
				}
			}
		}
		System.out.println(letter + " " + max);

	}

}

//Input (stdin)
//iron man
//
//Output (stdout)
//n 2