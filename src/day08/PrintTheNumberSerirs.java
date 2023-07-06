package day08;

import java.util.Scanner;

public class PrintTheNumberSerirs {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int value = 7;
		int tech = 10;
		int num = (int) Math.ceil(n / 2);
		for (int i = 1; i <= num; i++) {

			System.out.print(value + " ");
			value++;
			System.out.print(tech + " ");
			tech++;
		}

	}

}
