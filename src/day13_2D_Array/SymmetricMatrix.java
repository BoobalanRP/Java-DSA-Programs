package day13_2D_Array;

//Input (stdin)
//2
//2
//3 4
//4 3
//
//Output (stdout)
//Symmetric
import java.util.Scanner;

public class SymmetricMatrix {

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
		if (x == y) {
			int[][] arr1 = new int[x][y];
			for (int i = 0; i < x; i++) {
				for (int j = 0; j < y; j++) {
					arr1[j][i] = arr[i][j];
				}
			}

			boolean value = true;
			for (int i = 0; i < x; i++) {
				for (int j = 0; j < y; j++) {
					if (arr[i][j] != arr1[i][j]) {
						value = false;
						break;
					}
				}
			}

			if (!value) {
				System.out.println("Not Symmetric");
			} else {
				System.out.println("Symmetric");
			}
		} else {
			System.out.println("Symmetric");
		}

	}

}
