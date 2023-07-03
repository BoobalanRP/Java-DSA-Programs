package day07;

import java.util.Scanner;

public class PascalsTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rowNumber = sc.nextInt();

		int[] row = getPascalRow(rowNumber);

		for (int i = 0; i < row.length; i++) {
			System.out.print(row[i] + " ");
		}
	}

	public static int[] getPascalRow(int rowNumber) {
		int[] row = new int[rowNumber + 1];
		row[0] = 1;

		for (int i = 1; i <= rowNumber; i++) {
			for (int j = i; j > 0; j--) {
				row[j] += row[j - 1];
			}
		}

		return row;
	}

}
