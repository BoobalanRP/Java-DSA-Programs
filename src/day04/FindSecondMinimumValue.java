package day04;

import java.util.Scanner;

public class FindSecondMinimumValue {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		String fa = sc.next();

		if (fa.equals("L1")) {
			if (y < z) {
				System.out.println("L2");
			} else {
				System.out.println("L3");
			}
		} else if (fa.equals("L2")) {
			if (x < z) {
				System.out.println("L1");
			} else {
				System.out.println("L3");
			}
		} else {
			if (x < y) {
				System.out.println("L1");
			} else {
				System.out.println("L2");
			}
		}

	}

}
