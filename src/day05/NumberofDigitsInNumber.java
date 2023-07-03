package day05;

import java.util.Scanner;

public class NumberofDigitsInNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();
		String changeString = Integer.toString(value);
		System.out.println(changeString.length());

	}

}
