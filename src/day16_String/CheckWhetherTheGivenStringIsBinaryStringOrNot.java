package day16_String;

import java.util.Scanner;

public class CheckWhetherTheGivenStringIsBinaryStringOrNot {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String val = num + "";
		int count = 0;
		for (int i = 0; i < val.length(); i++) {
			if (val.charAt(i) == '0' || val.charAt(i) == '1') {
				count++;
			}
		}
		if (count == val.length()) {
			System.out.println("Binary String");
		} else {
			System.out.println("Not a Binary String");
		}
	}

}

//Input (stdin)
//1261010
//
//Output (stdout)
//Not a Binary String
//
//
//Input (stdin)
//1101010111
//
//Output (stdout)
//Binary String