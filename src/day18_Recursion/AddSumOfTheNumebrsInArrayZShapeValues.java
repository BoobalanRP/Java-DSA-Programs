package day18_Recursion;

public class AddSumOfTheNumebrsInArrayZShapeValues {

	public static void main(String[] args) {
		int n = 4;
		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 1, 2, 3 }, { 4, 5, 6, 7 } };
		int total = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 || i == n - 1 || j == n - i - 1) {
					total += arr[i][j];
				}
			}
		}
		System.out.println("final: " + total);

	}

}
