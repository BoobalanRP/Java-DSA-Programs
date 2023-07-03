package day03;

import java.util.Scanner;

public class ToAddFirstDigitandLastDigit {

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		int val = n.nextInt();

		int firstDigit = val / 1000;
		int lastDigit = val % 10;

		System.out.println(firstDigit + lastDigit);

	}

}
