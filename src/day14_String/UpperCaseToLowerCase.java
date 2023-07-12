package day14_String;

import java.util.Scanner;

//Input: GOOD;
//Output: good;

public class UpperCaseToLowerCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String b = "";

		for (int i = 0; i < str.length(); i++) {
			int c = str.charAt(i);
			//System.out.println(c + " " + " ");
			if (c >= 65 && c <= 96) {
				c += 32;
			}
			//System.out.println(c + " " + " ");
			b += (char) c;
		}

		System.out.println(b);

	}

}
