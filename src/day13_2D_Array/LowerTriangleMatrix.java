package day13_2D_Array;

import java.util.Scanner;

//Input (stdin)
//2
//1 0
//2 3
//
//Output (stdout)
//Yes
public class LowerTriangleMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int[][] arr = new int[x][x];
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < x; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int val = (int) Math.ceil(x / 2);
		int value = val - 1;
		boolean lowermatrix = false;
		for (int i = 1; i < x; i++) {
			for (int j = 0; j < x; j++) {
				if (i != j && arr[j][i] == 0) {
					lowermatrix = true;
					break;
				}
			}
		}
		if (lowermatrix) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}
