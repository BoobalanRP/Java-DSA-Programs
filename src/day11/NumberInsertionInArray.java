package day11;

import java.util.Scanner;

public class NumberInsertionInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr1 = new int[n];
		for (int i = 0; i < n; i++) {
			arr1[i] = sc.nextInt();
		}
		int position = sc.nextInt();

		if (position < 0 || position > n || arr1.length >= 20) {
			System.out.println("Invalid Input");
			return;
		}
		int value = sc.nextInt();
		System.out.println("Array after insertion is: ");
		for (int i = 1; i <= arr1.length + 1; i++) {

			if (i < position) {

				System.out.println(arr1[i - 1]);
			} else if (i == position) {
				System.out.println(value);
			} else if (i > position) {
				System.out.println(arr1[i - 2]);
			}
		}

	}

}
