package day16_String;

import java.util.Scanner;

public class CountTheNumberIntegerInTheGivenString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String val = sc.next();
		int count = 0;

		for (int i = 0; i < val.length(); i++) {
			if (Character.isDigit(val.charAt(i))) {
				count++;
			}
		}

		System.out.println("The number of digits is:");
		System.out.println(count);
		System.out.println("The number of characters is:");
		System.out.println(val.length() - count);
	}

}
//
//Input (stdin)
//Hello123
//
//Output (stdout)
//The number of digits is:
//3
//The number of characters is:
//5