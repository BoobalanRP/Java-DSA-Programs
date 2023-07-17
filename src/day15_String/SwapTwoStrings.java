package day15_String;

import java.util.Scanner;

public class SwapTwoStrings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		String word1 = sc.nextLine();
		word = word.trim();
		word1 = word1.trim();

		System.out.println("Strings before swapping: " + word + " " + word1);
		System.out.println("Strings after swapping: " + word1 + " " + word);

	}

}

//Input (stdin)
//Good 
//Morning
//
//Output (stdout)
//Strings before swapping: Good Morning
//Strings after swapping: Morning Good