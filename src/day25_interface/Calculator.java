package day25_interface;

import java.util.*;

class Calculator {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		String symbol = sc.next();
		int b = sc.nextInt();

		if (symbol.contains("+")) {
			System.out.println(a + b);
		} else if (symbol.contains("-")) {
			System.out.println(a - b);
		} else if (symbol.contains("*")) {
			System.out.println(a * b);
		} else if (symbol.contains("/")) {
			System.out.println(a / b);
		} else if (symbol.contains("%")) {
			System.out.println(a % b);
		}
	}
}


//Input (stdin)
//5
//+
//6
//
//Output (stdout)
//11