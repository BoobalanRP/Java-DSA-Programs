package day13_2D_Array;

import java.util.Scanner;

//Input (stdin)
//4 4
//0 0 0 1
//0 0 1 1
//0 0 1 1
//0 0 0 0
//
//Output (stdout)
//1
public class maximumNumberOfOnes {

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
		int[] arr1 = new int[x];
		int count = 0;
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				if (arr[i][j] == 1) {
					count++;
				}
			}
			arr1[i] = count;
			count = 0;
		}
		int value = 0;
		int index = 0;
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] > value) {
				value = arr1[i];
				index = i;
			}

		}

	}
}
