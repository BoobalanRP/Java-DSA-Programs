package day04;

import java.util.Scanner;

public class FindLeapYearorNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		int difYear = Math.abs(2016 - year);
		if (difYear % 4 == 0) {
			System.out.println(year + " is a leap year");
		} else {
			System.out.println(year + " is not a leap year");
		}

	}

}
