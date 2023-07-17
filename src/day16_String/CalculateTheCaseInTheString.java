package day16_String;

import java.util.Scanner;

public class CalculateTheCaseInTheString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String val = sc.next();
		int lowerCase = 0;
		int upperCase = 0;

		for (char wr = 'a'; wr <= 'z'; wr++) {
			if (val.contains(String.valueOf(wr))) {
				lowerCase++;
			}
		}

		upperCase = val.length() - lowerCase;

		System.out.println(lowerCase);
		System.out.println(upperCase);

	}

}

//Input (stdin)
//FacePREP
//
//Output (stdout)
//3
//5