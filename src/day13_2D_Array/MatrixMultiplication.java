package day13_2D_Array;
//Input (stdin)

//3 3
//1 2 3
//4 5 6
//7 8 9
//
//9 8 7
//6 5 4
//3 2 1
//
//Output (stdout)
//30 24 18
//84 69 54
//138 114 90

import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int[][] arr = new int[x][x];
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < x; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int[][] arr1 = new int[y][y];
		for (int i = 0; i < y; i++) {
			for (int j = 0; j < y; j++) {
				arr1[i][j] = sc.nextInt();
			}
		}
		int value = 0;
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				for (int k = 0; k < y; k++) {
					value += arr[i][k] * arr1[k][j];

				}
				System.out.print(value + " ");
				value = 0;
			}
			System.out.println();
		}

	}

}
