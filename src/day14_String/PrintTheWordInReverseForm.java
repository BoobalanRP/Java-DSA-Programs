package day14_String;

import java.util.Scanner;

//Input (stdin)
//hello
//
//Output (stdout)
//olleh

public class PrintTheWordInReverseForm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		char a;
		String b = "";
		for (int i = 0; i < word.length(); i++) {
			a = word.charAt(word.length() - i - 1);
			b += a;

		}
		System.out.print(b);

	}

}
