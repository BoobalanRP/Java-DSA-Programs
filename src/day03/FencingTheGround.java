package day03;

import java.util.Scanner;

public class FencingTheGround {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int val1 = sc.nextInt();
		int val2 = sc.nextInt();

		int length1 = (val1 + val2) * 2;
		int quantity = val1 * val2;

		System.out.println(length1 + "m");
		System.out.println(quantity + "sqm");

	}

}
