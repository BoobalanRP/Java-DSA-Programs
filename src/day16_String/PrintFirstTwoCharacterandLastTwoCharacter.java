package day16_String;

import java.util.Scanner;

public class PrintFirstTwoCharacterandLastTwoCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String val = sc.nextLine();
		String first = "", last = "";
		for (int i = 0; i < 2; i++) {
			first += val.charAt(i);
			last += val.charAt(val.length() - 2 + i);
		}
		System.out.print(first + last);

	}

}

//Input (stdin)
//hello world
//
//Output (stdout)
//held