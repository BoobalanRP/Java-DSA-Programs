package day16_String;

import java.util.Scanner;

public class RemoveGivenIndexCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String val = sc.next();
		int index = sc.nextInt();
		String word = "";
		for (int i = 0; i < val.length(); i++) {
			if (i != index) {
				word += val.charAt(i);
			}

		}
		System.out.println(word);
	}

}

//Input (stdin)
//Hello
//3
//
//Output (stdout)
//Helo