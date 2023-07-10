package day12_2D_Array;

import java.util.Scanner;

public class AddtionOfTwoArraysRow {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int[][] arr1 = new int[x][y];
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				arr1[i][j] = sc.nextInt();
			}
		}
		int[][] arr2 = new int[x][y];
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				arr2[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				int value = 0;
				value = arr1[i][j] + arr2[i][j];
				System.out.print(value + " ");
			}
			System.out.println();

		}
	}

}
