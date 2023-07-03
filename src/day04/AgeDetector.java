package day04;

import java.util.Scanner;

public class AgeDetector {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int birthYear = sc.nextInt();
		int currentYear = sc.nextInt();

		int currentAge = 0;

		if (birthYear > currentYear) {
			currentAge = (100 - birthYear) + currentYear;
		} else if (birthYear < currentYear) {
			currentAge = Math.abs(birthYear - currentYear);
		}
		System.out.println(currentAge);

	}

}
