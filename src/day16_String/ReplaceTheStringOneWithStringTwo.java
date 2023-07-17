package day16_String;

import java.util.Scanner;

public class ReplaceTheStringOneWithStringTwo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String string1 = sc.nextLine();
		String string2 = sc.nextLine();

		char firstChar = string2.charAt(0);

		String result;
		if (string1.indexOf(firstChar) != -1) {
			result = string1.substring(0, string1.indexOf(firstChar)) + string2;
		} else {
			result = string1 + " " + string2;
		}

		System.out.println(result);

	}

}

//Input (stdin)
//Lord Voldemort
// Tyrion
//
//Output (stdout)
//Lord Tyrion
