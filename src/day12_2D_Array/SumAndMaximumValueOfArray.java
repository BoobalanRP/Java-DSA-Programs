package day12_2D_Array;

//Input (stdin)
//2
//2
//5 7
//9 7
//
//Output (stdout)
//Sum of rows is 12 16
//Row 2 has maximum sum
//Sum of columns is 14 14
//Column 1 has maximum sum
import java.util.Scanner;

public class SumAndMaximumValueOfArray {

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

		// sum of rows
		int[] row = new int[x];
		for (int i = 0; i < x; i++) {
			int value = 0;
			for (int j = 0; j < y; j++) {
				value += arr1[i][j];
			}
			row[i] = value;
		}

		// sum of columns
		int[] columns = new int[y];
		for (int i = 0; i < y; i++) {
			int value1 = 0;
			for (int j = 0; j < x; j++) {
				value1 += arr1[j][i];
			}
			columns[i] = value1;
		}

		System.out.print("Sum of rows is ");
		for (int i = 0; i < row.length; i++) {
			System.out.print(row[i] + " ");
		}
		System.out.println();

		int maxValue = 0, count = 0;
		for (int i = 0; i < row.length; i++) {
			if (row[i] > maxValue) {
				maxValue = row[i];
				count = i + 1;
			}
		}
		System.out.println("Row " + count + " has maximum sum");

		System.out.print("Sum of columns is ");
		for (int i = 0; i < columns.length; i++) {
			System.out.print(columns[i] + " ");
		}

		System.out.println();

		int maxValue1 = 0, count1 = 0;
		for (int i = 0; i < columns.length; i++) {
			if (columns[i] > maxValue1) {
				maxValue1 = columns[i];
				count1 = i + 1;
			}
		}
		System.out.println("Column " + count1 + " has maximum sum");
	}

}
