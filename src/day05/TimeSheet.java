package day05;
//Time Sheet
//Jeevitha just started work as a programming trainer for UIT's Placement Cell. She is paid Rs.100 an hour, with a few exceptions. She earns an extra Rs.15 an hour for any part of a day where she works more than 8 hours, and an extra Rs.25 an hour for hours beyond 40 in any one week. Also, she earns a 25% bonus for working on Saturday and a 50% bonus for working on Sunday. The bonuses for Saturday and Sunday are computed based on the hours worked those days; they are not used to calculate any bonus for working more than 40 hours in a week. You'll be given the number of hours Jeevitha worked on each day in a week (Sunday, Monday, ..., Saturday), and you need to compute her salary for the week.
//Input format:
//
//Input consists of 7 integers less than or equal to 24 on separate lines
//
//
//
//Output format:
//
//Print the Jeevith's salary for a week.
import java.util.Scanner;

public class TimeSheet {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int sun, mon, tue, wed, thurs, fri, sat;
		int bonus, bonusrate, rate1, rate2, rate3, rate4, rate5, rate6, rate7, rate8 = 0;
		int edays, totaldays, totalrate;

		sun = scanner.nextInt();
		mon = scanner.nextInt();
		tue = scanner.nextInt();
		wed = scanner.nextInt();
		thurs = scanner.nextInt();
		fri = scanner.nextInt();
		sat = scanner.nextInt();

		rate1 = sun * 150;
		rate7 = sat * 125;

		if (mon <= 8) {
			rate2 = mon * 100;
		} else {
			bonus = mon - 8;
			bonusrate = bonus * 115;
			rate2 = bonusrate + 800;
		}
		if (tue <= 8) {
			rate3 = tue * 100;
		} else {
			bonus = tue - 8;
			bonusrate = bonus * 115;
			rate3 = bonusrate + 800;
		}
		if (wed <= 8) {
			rate4 = wed * 100;
		} else {
			bonus = wed - 8;
			bonusrate = bonus * 115;
			rate4 = bonusrate + 800;
		}
		if (thurs <= 8) {
			rate5 = thurs * 100;
		} else {
			bonus = thurs - 8;
			bonusrate = bonus * 115;
			rate5 = bonusrate + 800;
		}
		if (fri <= 8) {
			rate6 = fri * 100;
		} else {
			bonus = fri - 8;
			bonusrate = bonus * 115;
			rate6 = bonusrate + 800;
		}

		totaldays = mon + tue + wed + thurs + fri;
		if (totaldays > 40) {
			edays = totaldays - 40;
			rate8 = edays * 25;
		}
		totalrate = rate1 + rate2 + rate3 + rate4 + rate5 + rate6 + rate7 + rate8;
		System.out.println(totalrate);

	}

}
