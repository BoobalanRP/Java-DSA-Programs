package day15_String;

import java.util.Scanner;

//Input (stdin)
//hello
//hello
//
//Output (stdout)
//Strings are same
public class StringCompare {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();

		if (a.length() == b.length()) {
			System.out.println("Strings are same");
		} else {
			System.out.println("Strings are not same");
		}

	}

}
