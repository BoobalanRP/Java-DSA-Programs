package day15_String;

import java.util.Scanner;

public class MinimumNumberStringJava {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int minValue = 100;
		String numStr = "";

		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if (Character.isDigit(c)) {
				numStr += c;
			} else {
				if (numStr.length() > 0) {
					int num = Integer.parseInt(numStr.toString());
					minValue = Math.min(minValue, num);
					numStr = "";
				}
			}
		}
		System.out.println(minValue);

	}

}

//Input (stdin)
//lar5g6e
//
//Output (stdout)
//5