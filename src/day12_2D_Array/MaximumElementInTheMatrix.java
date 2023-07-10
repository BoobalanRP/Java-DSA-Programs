package day12_2D_Array;

import java.util.Scanner;

public class MaximumElementInTheMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int[][] arr = new int[x][y];
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int maxValue = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i][j] > maxValue) {
					maxValue = arr[i][j];
				}
			}
		}
		System.out.println(maxValue);

	}

}
