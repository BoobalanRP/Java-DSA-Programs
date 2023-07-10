package day12_2D_Array;
//Input (stdin)
//3
//2
//4
//5
//6
//9
//0
//3
//
//Output (stdout)
//5
import java.util.Scanner;

public class MaximumElementInEachRow {

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

		for (int i = 0; i < x; i++) {
			int maxValue = 0;
			for (int j = 0; j < y; j++) {
				if (arr[i][j] > maxValue) {
					maxValue = arr[i][j];

				}
			}
			System.out.println(maxValue);
		}

	}

}
