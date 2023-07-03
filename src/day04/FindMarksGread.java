package day04;

import java.util.Scanner;

public class FindMarksGread {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int val = sc.nextInt();

		if (val == 100) {
			System.out.println("S");
		} else if (val >= 90 && val <= 99) {
			System.out.println("A");
		} else if (val >= 80 && val <= 89) {
			System.out.println("B");
		} else if (val >= 70 && val <= 79) {
			System.out.println("C");
		} else if (val >= 60 && val <= 69) {
			System.out.println("D");
		} else if (val >= 50 && val <= 59) {
			System.out.println("E");
		} else if (val < 50) {
			System.out.println("F");
		}
	}
}
