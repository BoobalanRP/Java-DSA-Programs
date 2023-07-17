package day16_String;

import java.util.Scanner;

public class ReplaceDolarSymbleInsteadOfChapitalA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String val = sc.next();
		char let;
		String word = "";
		for (int i = 0; i < val.length(); i++) {
			if (val.charAt(i) == 'A') {
				word += '$';
			} else {
				word += val.charAt(i);
			}
		}
		System.out.print(word);
	}

}

//Input (stdin)
//Apple
//
//Output (stdout)
//$pple
//
//Input (stdin)
//and
//
//Output (stdout)
//and