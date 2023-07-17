package day15_String;

//Input (stdin)
//I love programming@
//
//Output (stdout)
//Total number of characters in a string: 17

import java.util.Scanner;

public class TotalNumberCharectorInSentence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		char a;
		int count = 0;
		for (int i = 0; i < name.length(); i++) {
			a = name.charAt(i);
			if (a == ' ') {
				continue;
			} else {
				count++;
			}

		}
		System.out.println("Total number of characters in a string: " + count);
	}

}
