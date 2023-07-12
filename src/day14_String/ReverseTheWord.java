package day14_String;

import java.util.Scanner;

public class ReverseTheWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String b = "";

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(str.length() - i - 1);
			b += c;
		}

		System.out.println(b);
	}

}
