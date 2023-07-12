package day14_String;

import java.util.Scanner;

//Input (stdin)
//The quick brown fox jumps over the lazy dog
//
//Output (stdout)
//The string is a pangram

public class TheStringIsPangram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int counter = 0;

		for (char ch = 'a'; ch <= 'z'; ch++) {
			if (input.toLowerCase().contains(String.valueOf(ch))) {
				counter++;
			}
		}

		if (counter == 26) {
			System.out.println("The string is a pangram");
		} else {
			System.out.println("The string isn't a pangram");
		}

	}

}
