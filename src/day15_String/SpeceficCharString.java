package day15_String;

import java.util.Scanner;

public class SpeceficCharString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String p = sc.nextLine();

		String value = s.replace(" ", p);
		System.out.println(value);
	}

}
//Input (stdin)
//Hope The Best
//$
//
//Output (stdout)
//Hope$The$Best