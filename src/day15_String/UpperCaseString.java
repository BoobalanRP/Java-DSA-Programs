package day15_String;

import java.util.Scanner;

//Input (stdin)
//A man without money is a bow without an arrow
//
//Output (stdout)
//String after case conversion : a MAN WITHOUT MONEY IS A BOW WITHOUT AN ARROW
//
//Input (stdin)
//haPPy LearNinG
//
//Output (stdout)
//String after case conversion : HAppY lEARnINg

public class UpperCaseString {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		String b = "";
		for (int i = 0; i < input.length(); i++) {
			if (Character.isUpperCase(input.charAt(i))) {
				b += Character.toLowerCase(input.charAt(i));
			} else {
				b += Character.toUpperCase(input.charAt(i));
			}
		}
		System.out.println("String after case conversion : " + b);

	}

}
