package day21_ClassAndObject;

import java.util.Scanner;

public class AddingToTimes {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		int n4 = sc.nextInt();
		int n5 = sc.nextInt();
		int n6 = sc.nextInt();
		int sec = n3 + n6;
		int count1 = 0;
		while (sec >= 60) {
			count1++;
			sec -= 60;
		}
		int min = n2 + n5;
		int count2 = 0;
		while (min >= 60) {
			count2++;
			min -= 60;
		}

		int tSecond = sec;
		int tMinutes = min + count1;
		int tHours = n1 + n4 + count2;

		System.out.println("Time after add:" + tHours + ":" + tMinutes + ":" + tSecond);
	}

}
