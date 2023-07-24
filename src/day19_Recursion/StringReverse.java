package day19_Recursion;

import java.util.Scanner;

public class StringReverse {
	public static void StringReverse(String a1, int a2) {
		if (a2 >= 0) {
			System.out.print(a1.charAt(a2));
			StringReverse(a1, a2 - 1);
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String w1 = sc.next();

		StringReverse(w1, w1.length() - 1);

	}
}


//Input (stdin)
//hello
//
//Output (stdout)
//olleh