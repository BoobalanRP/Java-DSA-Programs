package day16_String;

import java.util.Scanner;

public class StringAndReplaceEveryBlankSpaceWithHyphen {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String val = sc.nextLine();
		String word = "";

		for (int i = 0; i < val.length(); i++) {
			if (' ' == val.charAt(i)) {
				word += '-';
			} else {
				word += val.charAt(i);
			}
		}

		System.out.println(word);

	}

}

//Input (stdin)
//hello world
//
//Output (stdout)
//hello-worlds