package day12_2D_Array;
//Input (stdin)

//3
//2 4 6
//8 10 12
//14 16 18
//
//Output (stdout)
//Yes

//Input (stdin)
//2
//4 5
//5 4
//
//Output (stdout)
//No

import java.util.Scanner;

public class FindAllTheNumberInArrayOddOrEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int rows = sc.nextInt();

		int[][] matrix = new int[rows][rows];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < rows; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}

		// find odd or even
		int count = 0;
		int count1 = 0;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < rows; j++) {
				if (matrix[i][j] % 2 == 0) {
					count++;
				} else {
					count1++;
				}
			}
		}
		if (count == rows * rows || count1 == rows * rows) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}
