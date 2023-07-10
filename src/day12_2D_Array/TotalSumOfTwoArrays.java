package day12_2D_Array;

//Input (stdin)
//3
//2
//4 5
//6 9
//0 3
//
//Output (stdout)
// The sum of the elements in the matrix is 27
import java.util.Scanner;

public class TotalSumOfTwoArrays {

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
		int addition = 0;
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {

				addition += arr[i][j];

			}
		}
		System.out.println(" The sum of the elements in the matrix is " + addition);

	}

}
