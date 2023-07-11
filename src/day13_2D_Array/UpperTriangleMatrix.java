package day13_2D_Array;

//Input (stdin)
//2
//1 2
//0 3
//
//Output (stdout)
//Yes
import java.util.Scanner;

public class UpperTriangleMatrix {

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
		boolean uppermatrix = false;
		for (int i = 1; i < x; i++) {
			for (int j = 0; j < x; j++) {
				if (i != j && arr[i][j] == 0) {
					uppermatrix = true;
					break;
				}
			}
		}
		if (uppermatrix) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}
