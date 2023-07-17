package day16_String;

import java.util.Scanner;

public class LargerStringWithoutUsingBuiltInFunctions {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String val1 = sc.next();
		String val2 = sc.next();
		if (val1.length() > val2.length()) {
			System.out.println(val1);
		} else {
			System.out.println(val2);
		}

	}

}

//Input (stdin)
//Focus
//Faceprep
//
//Output (stdout)
//Faceprep