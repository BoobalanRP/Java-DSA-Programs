package day12_2D_Array;

//Input (stdin)
//3
//3
//7 6 5
//3 4 6
//2 3 6
//
//Output (stdout)
//Sum of boundaries is 38
import java.util.Scanner;

public class SumOfBoundaries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int rows = sc.nextInt();
		int columns = sc.nextInt();

		int[][] matrix = new int[rows][columns];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}

		// the sum of boundaries
		int sum = 0;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				if (i == 0 || i == rows - 1 || j == 0 || j == columns - 1) {
					sum += matrix[i][j];
				}
			}
		}

		System.out.println("Sum of boundaries is " + sum);

	}

}
