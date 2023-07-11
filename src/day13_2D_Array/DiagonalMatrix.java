package day13_2D_Array;

//Input (stdin)
//2
//4 5
//5 4
//
//Output (stdout)
//No
import java.util.Scanner;

public class DiagonalMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int[][] arr = new int[x][x];
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < x; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		boolean value = false;
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < x; j++) {
				if (i != j && arr[i][j] != 0) {
					value = true;
				}
			}
		}
		if (value) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}

	}

}
