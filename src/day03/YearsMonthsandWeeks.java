package day03;

import java.util.Scanner;

public class YearsMonthsandWeeks {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int days = scanner.nextInt();

		int years = days / 365;
		int remainingDays = days % 365;
		int weeks = remainingDays / 7;
		int remainingDaysFinal = remainingDays % 7;

		System.out.println(years);
		System.out.println(weeks);
		System.out.println(remainingDaysFinal);

	}

}
