package day08;

import java.util.Scanner;

public class PrintTheSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int value = 6;
		System.out.print(value + " ");

		for (int i = 1; i < n; i++) {
			value += (5 * i);
			System.out.print(value + " ");
		}

	}

}
