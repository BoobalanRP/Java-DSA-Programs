package day12_2D_Array;

//Input (stdin)
//2
//2
//56 62
//96 36
//
//Output (stdout)
//96
//62
import java.util.Scanner;

public class MaximumElementInEachColumn {

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
		// find maximum element in columns
		for (int i = 0; i < x; i++) {
			int maxColumnValue = 0;
			for (int j = 0; j < y; j++) {
				if (arr1[j][i] > maxColumnValue) {
					maxColumnValue = arr1[j][i];
				}

			}
			System.out.println(maxColumnValue);
		}

	}

}
