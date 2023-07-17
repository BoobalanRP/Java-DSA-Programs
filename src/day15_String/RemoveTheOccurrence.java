package day15_String;

import java.util.Scanner;

//Input (stdin)
//remove the occurrence of the word from entered string
//
//Output (stdout)
//remove occurrence of word from entered string

public class RemoveTheOccurrence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String[] word = a.split("[ ]");
		String word1 = "";
		for (int i = 0; i < word.length; i++) {
			if (!word[i].equals("the")) {
				word1 += word[i] + " ";
			}
		}
		System.out.println(word1);

	}

}
