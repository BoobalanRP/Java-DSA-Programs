package day04;

import java.util.Scanner;

public class FindMinimumValue {

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);

		int x = n.nextInt();
		int y = n.nextInt();
		int z = n.nextInt();

		String miniValue;

		if (x < y && x < z) {
			miniValue = "L1";
		} else if (y < z) {
			miniValue = "L2";
		} else {
			miniValue = "L3";
		}
		System.out.println(miniValue);

	}

}
