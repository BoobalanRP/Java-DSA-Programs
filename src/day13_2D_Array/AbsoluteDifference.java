package day13_2D_Array;

//Sum across the secondary diagonal: 4 + 5 + 10 = 19
//Sum across the primary diagonal: 11 + 5 - 12 = 4
//Absolute Difference = |4 - 19| = 15. 
//
//        
//
//
//Case 1
//Input (stdin)
//3
//11 2 4
//4 5 6
//10 8 -12
//
//Output (stdout)
//15
import java.util.Scanner;

public class AbsoluteDifference {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		int[][] arr = new int[x][x];

		for (int i = 0; i < x; i++) {
			for (int j = 0; j < x; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int forword = 0;
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < x; j++) {
				if (i == j) {
					forword += arr[i][j];
				}
			}
		}
//backword
		int[][] arr1 = new int[x][x];
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < x; j++) {
				arr1[i][x - j - 1] = arr[i][j];
			}
		}

		int backword = 0;
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < x; j++) {
				if (i == j) {
					backword += arr1[i][j];
				}
			}
		}

		int absoluteDifference = Math.abs(forword - backword);
		System.out.println(absoluteDifference);

	}

}
