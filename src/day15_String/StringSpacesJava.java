package day15_String;

//Input (stdin)
//123 456 7890
//
//Output (stdout)
//1234567890

import java.util.Scanner;

public class StringSpacesJava {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] arr = input.split(" ");
		// String val = input+"";
		String word = "";
		for (int i = 0; i < arr.length; i++) {

			word += arr[i];

		}
		System.out.println(word);

	}

}
