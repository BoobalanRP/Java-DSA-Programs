package day13_2D_Array;
//4

//1 2 3 4

//5 6 7 8
//9 10 11 12
//13 14 15 16
//
//Sample Output 2:
//
//1 2 3 4
//5 6 7 8
//9 10 11 12
//13 14 15 16
//
//Transpose matrix is:
//
//1 5 9 13
//2 6 10 14
//3 7 11 15
//4 8 12 16

import java.util.Scanner;

public class TransposeMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int[][] arr = new int[x][x];
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < x; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		// print matrix
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < x; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Transpose matrix is:");
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < x; j++) {

			}

		}
	}
}
