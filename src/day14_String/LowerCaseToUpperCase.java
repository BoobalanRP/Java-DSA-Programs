package day14_String;

import java.util.Scanner;

//input : good
//output: GOOD

public class LowerCaseToUpperCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String b = "";

		for (int i = 0; i < str.length(); i++) {
			int c = str.charAt(i);
			// System.out.println(c + " " + " ");
			if (c > 96 && c < 122) {
				c -= 32;
			}
			// System.out.println(c + " " + " ");
			b += (char) c;
		}

		System.out.println(b);

	}

}
